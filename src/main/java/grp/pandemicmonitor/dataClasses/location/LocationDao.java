package grp.pandemicmonitor.dataClasses.location;

import java.util.List;

public interface LocationDao {
    public Location getLocation(long ID);
    public void addLocation(String name,double longitude,double latitude);
    public void updateLocationMessage(long ID,String name,double longitude,double latitude);
    public void deleteLocation(long ID);
    public List<Location> getAllLocations();
    public List<Location> getLocationWithin(Location origin,double radius);
}
