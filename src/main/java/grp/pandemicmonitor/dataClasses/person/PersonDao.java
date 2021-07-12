package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.location.Location;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface PersonDao {

    public Person getPerson(String idNo) ;//x
    public Person validateLogin(String mail,String pword) ;//x
    public boolean addPerson(Person p) ;//x
    public boolean addPerson(Person p,String pword) ;//x
    public boolean changePersonalInfo(String idNo,String fullName,String phoneNo,String address) ;//x
    public boolean changePersonMail(String oldMail,String newMail) ;//x
    public boolean changePassword(String mail,String oldPword,String newPword);//x
    public void deletePerson(String idNo) ;//x
    public String getPassword(String idNo);//x
    public List<Person> getAllPerson() ;//x
    public List<Person> getAllPersonInvolvedInRoute(List<Location> route) ;
    public List<Person> getAllPersonVisitedBefore(Location loc, Time time, Date date);//x
    public List<Person> getAllPersonVisited(Location loc) ;


}

