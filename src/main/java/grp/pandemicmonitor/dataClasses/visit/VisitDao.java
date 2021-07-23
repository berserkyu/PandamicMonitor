package grp.pandemicmonitor.dataClasses.visit;

import grp.pandemicmonitor.InputFromFrontEnd.InputVisitElse;
import grp.pandemicmonitor.dataClasses.location.Location;

import java.util.List;

public interface VisitDao {
    boolean addVisit(Visit s);
    boolean addVisitElse(InputVisitElse ive);
    List<Visit> getVisitedLocationsId(String idNo);
    List<Location> getVisitedLocations(String idNo);
    public List<Visit> getVisitList(String idNo);
    List<Insertection> getInterSections(String idNo);
}