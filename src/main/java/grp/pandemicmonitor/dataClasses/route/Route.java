package grp.pandemicmonitor.dataClasses.route;

import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.person.Person;

import java.sql.Time;
import java.util.List;
import java.util.Timer;

public class Route {
    List<Location> locationVisited;
    List<Time> timeVisited;
    Person person;
}
