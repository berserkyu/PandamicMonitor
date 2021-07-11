package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.location.Location;

import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public interface PersonDao {
    public Person getPerson(String idNo) throws SQLException;
    public Person validateLogin(String mail,String pword) throws SQLException;
    public boolean addPerson(Person p) throws SQLException;
    public boolean addPerson(Person p,String pword) throws SQLException;
    public boolean changePersonalInfo(String idNo,String fullName,String phoneNo,String address) throws SQLException;
    public boolean changePersonMail(String oldMail,String newMail) throws SQLException;
    public boolean changePassword(String mail,String oldPword,String newPword) throws SQLException;
    public void deletePerson(String idNo) throws SQLException;
    public List<Person> getAllPerson() throws SQLException;
    public List<Person> getAllPersonInvolvedInRoute(List<Location> route) throws SQLException;
    public List<Person> getAllPersonVisited(Location loc) throws SQLException;
    public List<Person> getAllPersonVisitedBefore(Location loc, Time time) throws SQLException;

}

