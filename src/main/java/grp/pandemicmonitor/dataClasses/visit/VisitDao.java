package grp.pandemicmonitor.dataClasses.visit;

import grp.pandemicmonitor.InputFromFrontEnd.InputVisitElse;

import java.util.List;

public interface VisitDao {
    boolean addVisit(Visit s);
    boolean addVisitElse(InputVisitElse ive);
    List<Visit> getVisitedLocations(String idNo);
}
