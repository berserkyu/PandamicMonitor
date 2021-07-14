package grp.pandemicmonitor.dataClasses.route;

import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.person.Person;

import java.sql.Time;
import java.util.List;
import java.util.Timer;

//移动路径
public class Route {
    //以时间顺序访问的地点作为移动路径
    List<Location> locationVisited;
    List<Time> timeVisited;
    Person person;

    public List<Location> getLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(List<Location> locationVisited) {
        this.locationVisited = locationVisited;
    }

    public List<Time> getTimeVisited() {
        return timeVisited;
    }

    public void setTimeVisited(List<Time> timeVisited) {
        this.timeVisited = timeVisited;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
