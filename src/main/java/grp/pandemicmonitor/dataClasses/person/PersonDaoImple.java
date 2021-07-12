package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
@Component
public class PersonDaoImple implements PersonDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public Person getPerson(String idNo) throws SQLException {
        String sqlQuery = String.format("SELECT * FROM person WHERE idno='%s'",idNo);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()){
            return null;
        }else{
            return result.get(0);
        }
    }
    @Override
    public boolean addPerson(Person p) throws SQLException {
        String sqlCmd = String.format("INSERT INTO person(idno,mail,birthDay,fullname,phoneno" +
                        ",address,age,gender) VALUES('%s','%s','%s','%s','%s','%s',%d,'%s')",
                p.getIdNo(),p.getMail(),p.getBirthday(),p.getFullName(),
                p.getPhoneNo(),p.getAddress(),p.getAge(),p.getGender());
        int result = jdbcTemplate.update(sqlCmd);
        return  result == 1;
    }
    @Override
    public boolean addPerson(Person p,String pword) throws SQLException {
        if(!addPerson(p)) return  false;
        String sqlCmd = String.format("INSERT INTO loginInfo(mail,pword) VALUES(%s,%s)",p.getMail(),pword);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    public Person validateLogin(String mail,String pword) {
        String sqlQuery = String.format("select * from person,loginInfo " +
                                        "where person.mail=loginInfo.mail " +
                                        "and logiInfo.mail='%s' " +
                                        "and loginInfo.pword='%s'",
                                        mail,pword);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()) return  null;
        return  result.get(0);
    }

    public boolean changePassword(String mail,String oldPword,String newPword) throws SQLException{
        String sqlCmd = String.format("UPDATE loginInfo" +
                                    " SET pword='%s'" +
                                    " WHERE mail='%s'" +
                                    " AND pword='%s'",
                                    newPword,mail,oldPword);
        int rowsAffected = jdbcTemplate.update(sqlCmd);
        return rowsAffected>0;
    }

    @Override
    public boolean changePersonalInfo(String idNo, String fullName, String phoneNo, String address)  throws SQLException{
        String sqlCmd = String.format("UPDATE person WHERE idno='%s' " +
                                    " SET fullname='%s',phoneno='%s',address='%s'",
                                    fullName,phoneNo,address);
        int result = jdbcTemplate.update(sqlCmd);
        return  result==1;
    }

    @Override
    public boolean changePersonMail(String oldMail, String newMail) throws SQLException {
        String sqlCmd = String.format("CALL updateMail('%s','%s')",
                                    oldMail,newMail);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    public void deletePerson(String idNo) throws SQLException {
        String sqlCmd = String.format("DELETE FROM loginInfo" +
                                    " WHERE mail IN( SELECT mail" +
                                                    " FROM person" +
                                                    " WHERE idno='%s')",idNo);
        int result = jdbcTemplate.update(sqlCmd);
        if(result!=1){
            System.out.println("delete person SQL failed ");
            return;
        }
        sqlCmd = String.format("DELETE FROM person WHERE idNo='%s'",idNo);
        result = jdbcTemplate.update(sqlCmd);
        if(result!=1) System.out.println("delete person SQL failed ");
    }

    @Override
    public List<Person> getAllPerson() throws SQLException {
        String sqlQuery = "SELECT * FROM person";
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        return  result;
    }


    @Override
    public List<Person> getAllPersonVisited(Location loc)  throws SQLException{
        String sqlQuery = String.format("SELECT person.idno,mail,birthDay,fullname,phoneno,address,age,gender " +
                                        "FROM person,visit " +
                                        "WHERE person.idno=visit.idno " +
                                        "AND locId='%s'",loc.getID());
        List<Person> l = jdbcTemplate.query(sqlQuery,new PersonMapper());
        return  l;
    }

    @Override
    public List<Person> getAllPersonVisitedBefore(Location loc, Time time)  throws SQLException{
        String sqlQuery = String.format("SELECT person.idno,mail,birthDay,fullname,phoneno,address,age,gender " +
                "FROM person,visit " +
                "WHERE person.idno=visit.idno " +
                "AND arrivedTime<%s" +
                "AND locId='%s'",loc.getID(),time);
        List<Person> l = jdbcTemplate.query(sqlQuery,new PersonMapper());
        return  l;
    }

    @Override
    public List<Person> getAllPersonInvolvedInRoute(List<Location> route)  throws SQLException{
        return null;
    }

}
