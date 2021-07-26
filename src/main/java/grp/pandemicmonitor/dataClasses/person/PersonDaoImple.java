package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.loginInfo.LoginInfo;
import grp.pandemicmonitor.dataClasses.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.Date;
import java.util.List;
//人员信息数据库接口的实现
@Component
public class PersonDaoImple implements PersonDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    //得到身份证号id人员
    public Person getPerson(String idNo) {
        String sqlQuery = String.format("SELECT * FROM person WHERE idno='%s'",idNo);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()){
            return null;
        }else{
            return result.get(0);
        }
    }

    @Override
    //得到邮箱为mail的人员信息
    public Person getPersonByMail(String mail){
        String sqlQuery = String.format("SELECT * FROM person WHERE mail='%s'",mail);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()){
            return null;
        }else{
            return result.get(0);
        }
    }

    @Override
    //得到邮箱为mail的人员信息
    public Person getPersonById(String id){
        String sqlQuery = String.format("SELECT * FROM person WHERE idNo='%s'",id);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()){
            return null;
        }else{
            return result.get(0);
        }
    }

    @Override
    //得到邮箱为mail的人员信息
    public List<Person> getPersonByName(String name){
        String sqlQuery = String.format("SELECT * FROM person WHERE fullname='%s'",name);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()){
            return null;
        }else{
            return result;
        }
    }

    @Override
    //添加人员信息
    public boolean addPerson(Person p)  {
        String sqlCmd = String.format("INSERT INTO person(idno,mail,birthDay,fullname,phoneno" +
                        ",address,age,gender) VALUES('%s','%s',DATE '%s','%s','%s','%s',%d,'%s')",
                p.getIdNo(),p.getMail(),p.getBirthday(),p.getFullName(),
                p.getPhoneNo(),p.getAddress(),p.getAge(),p.getGender());
        int result = jdbcTemplate.update(sqlCmd);
        return  result == 1;
    }
    @Override
    //添加某人员以及其登录信息
    //此处可将两次数据库操作定义成事务，使其具有一致性
    public boolean addPerson(Person p,String pword)  {
        //因为登录信息的邮箱依赖于人员信息的邮箱信息
        //先添加人员信息，若失败返回
        if(!addPerson(p)) return  false;
        //若成功则添加登录信息
        String sqlCmd = String.format("INSERT INTO logininfo(mail,pword,accType) VALUES('%s','%s',1)",p.getMail(),pword);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }


    @Override
    //验证登录信息
    public Person validateLogin(String mail,String pword,int type) {
        //查询(邮箱，密码，账号类型)都对得上的数据记录
        String sqlQuery = String.format("select * from person,logininfo " +
                                        "where person.mail=logininfo.mail " +
                                        "and logininfo.mail='%s' " +
                                        "and logininfo.pword='%s'" +
                                        "and accType=%d",
                                        mail,pword,type);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()) return  null;
        return  result.get(0);
    }

    @Override
    //使用LoginInfo类的验证登录信息
    public Person validateLogin(LoginInfo l){
        String sqlQuery = String.format("select * from person,logininfo " +
                        "where person.mail=logininfo.mail " +
                        "and logininfo.mail='%s' " +
                        "and logininfo.pword='%s' " +
                        "and accType=%d",
                l.getMail(),l.getPassword(),l.getType());
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()) return  null;

        return  result.get(0);
    }

    @Override
    //更改密码
    public boolean changePassword(String mail,String oldPword,String newPword) {
        String sqlCmd = String.format("UPDATE logininfo" +
                                    " SET pword='%s'" +
                                    " WHERE pword='%s'" +
                                    " AND mail = '%s'",
                                    newPword,oldPword,mail);
        int rowsAffected = jdbcTemplate.update(sqlCmd);
        if(rowsAffected<1){
            System.out.println("change password failed");
        }
        return rowsAffected>0;
    }

    @Override
    //更改个人信息
    public boolean changePersonalInfo(String oldmail,String newmail, String fullName, String phoneNo, String address)  {
        String sqlCmd = String.format("UPDATE person  " +
                                    " SET fullname='%s',phoneno='%s',address='%s'" +
                                    " WHERE mail='%s'",
                                   fullName,phoneNo,address, oldmail);
        int result = jdbcTemplate.update(sqlCmd);
        return  result==1 && changePersonMail(oldmail,newmail);
    }

    @Override
    //更改邮箱
    public boolean changePersonMail(String oldMail, String newMail) {
        //在数据库里定义了一个Procedure updateMail(oldmail,newmail)
        //其中先执行更新登录信息里的邮箱，再更新人员信息的邮箱
        String sqlCmd = String.format("UPDATE logininfo SET mail='%s' WHERE mail='%s'",
                newMail,oldMail);
        int result = jdbcTemplate.update(sqlCmd);
        if(result!=1) {
            return  false;
        }
        sqlCmd = String.format("UPDATE person SET mail='%s' WHERE mail='%s'",
                newMail,oldMail);
        result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    //删除人员信息
    public boolean deletePerson(String idNo)  {
        //必须先删除依赖于人员信息的登录信息(通过邮箱)
        String sqlCmd = String.format("DELETE FROM logininfo" +
                                    " WHERE mail IN( SELECT mail" +
                                                    " FROM person" +
                                                    " WHERE idno='%s')",idNo);
        System.out.println(sqlCmd);
        int result = jdbcTemplate.update(sqlCmd);
        if(result!=1){
            return false;
        }
        //若成功了再删除人员信息
        sqlCmd = String.format("DELETE FROM person WHERE idNo='%s'",idNo);
        System.out.println(sqlCmd);
        result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    //得到人员的密码
    public String getPassword(String idNo){
        String sqlQuery = String.format("SELECT pword " +
                                        "FROM person,logininfo " +
                                        "WHERE person.mail=loginI=info.mail " +
                                        "AND idNo='%s'",idNo);
        List<String> result = jdbcTemplate.query(sqlQuery, new SingleColumnRowMapper<String>());
        return  result.get(0);
    }

    @Override
    //得到所有人员
    public List<Person> getAllPerson()  {
        String sqlQuery = "SELECT * FROM person";
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        return  result;
    }


    @Override
    //得到到访过地点loc的人员
    public List<Person> getAllPersonVisited(Location loc) {
        String sqlQuery = String.format("SELECT person.idno,mail,birthDay,fullname,phoneno,address,age,gender " +
                                        "FROM person,visit " +
                                        "WHERE person.idno=visit.idno " +
                                        "AND locId='%s'",loc.getLocId());
        List<Person> l = jdbcTemplate.query(sqlQuery,new PersonMapper());
        return  l;
    }

    @Override
    //得到在(time,date)之前到访过loc地点的人员
    public List<Person> getAllPersonVisitedBefore(Location loc, Time time, Date date) {
        String sqlQuery = String.format("SELECT person.idno,mail,birthDay,fullname,phoneno,address,age,gender " +
                "FROM person,visit " +
                "WHERE person.idno=visit.idno " +
                "AND ((timeVisit<'%s' AND dateVisit='%s') OR " +
                "dateVisit<'%s' )" +
                "AND locId=%d",time,date,date,loc.getLocId());
        List<Person> l = jdbcTemplate.query(sqlQuery,new PersonMapper());
        return  l;
    }

    @Override
    public List<Person> getAllPersonInvolvedInRoute(List<Location> route)  {
        return null;
    }


    @Override
    public boolean setPersonCautionLevel(String mail,int lv){
        if(lv<0) return false;
        String sqlCmd = String.format("UPDATE person SET cautionLevel=%d WHERE mail='%s'",lv,mail);
        System.out.println(sqlCmd);
        int result = jdbcTemplate.update(sqlCmd);
        return  result==1;
    }
}
