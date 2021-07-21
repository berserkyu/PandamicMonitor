package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.loginInfo.LoginInfo;
import grp.pandemicmonitor.dataClasses.location.Location;

import java.sql.Time;
import java.util.Date;
import java.util.List;

//person对象与数据库之间的接口
public interface PersonDao {
    //得到身份证号为idNo的人员信息
    Person getPerson(String idNo) ;//x
    //得到邮箱为mail的人员信息
    Person getPersonByMail(String mail) ;//x
    Person getPersonById(String id);
    List<Person> getPersonByName(String name);
    //验证登录信息
    Person validateLogin(String mail,String pword,int type) ;//x
    //通过LoginInfo类验证登录信息
    Person validateLogin(LoginInfo l) ;//x
    //往数据库添加人员信息
    boolean addPerson(Person p);//x
    //往数据库添加人员以及此人员的登录信息
    boolean addPerson(Person p,String pword);//x
    //修改数据库里的人员信息
    boolean changePersonalInfo(String oldmail,String newmail, String fullName, String phoneNo, String address);//x
    //密码和邮箱由于不止涉及person表 故分开接口
    //修改数据库里的人员邮箱
    boolean changePersonMail(String oldMail,String newMail);//x
    //修改数据库里的人员登录密码
    boolean changePassword(String mail,String oldPword,String newPword);//x
    //删除人员信息
    boolean deletePerson(String idNo);//x
    //
    boolean setPersonCautionLevel(String mail,int lv);
    //得到某人员登录密码
    String getPassword(String idNo);//x
    //得到所有人员
    List<Person> getAllPerson();//x
    //得到与此路径相交的人员
    List<Person> getAllPersonInvolvedInRoute(List<Location> route);
    //得到在(time,date)之前到过loc地点的人员
    List<Person> getAllPersonVisitedBefore(Location loc, Time time, Date date);//x
    //得到在任何时候曾经到过loc地点的人员
    List<Person> getAllPersonVisited(Location loc);
}

