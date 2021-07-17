package grp.pandemicmonitor.dataClasses.visit;

import java.util.List;

public interface VisitDao {
    boolean addVisit(Visit s);
    List<Visit> getVisitedLocations(String idNo);
}
