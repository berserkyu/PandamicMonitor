package grp.pandemicmonitor.dataClasses.visit;

import java.util.List;

public interface VisitDao {
    public boolean addVisit(Visit s);
    public List<Visit> getVisitedLocations(String idNo);
}
