package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.location.Location;

import java.sql.Time;
import java.util.List;

public interface PersonDao {
    public Person getPerson(String idNo);
    public boolean addPerson(Person p);
    public boolean changePersonalInfo(String idNo,String fullName,String phoneNo,String address);
    public boolean changePersonMail(String oldMail,String newMail);
    public void deletePerson(String idNo);
    public List<Person> getAllPerson();
    public List<Person> getAllPersonInvolvedInRoute(List<Location> route);
    public List<Person> getAllPersonVisited(Location loc);
    public List<Person> getAllPersonVisitedBefore(Location loc, Time time);

}

