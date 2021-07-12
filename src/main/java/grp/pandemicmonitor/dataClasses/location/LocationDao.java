package grp.pandemicmonitor.dataClasses.location;

import java.sql.SQLException;
import java.util.List;

public interface LocationDao  {
    public Location getLocation(long ID) ;//x
    public void addLocation(String name,double longitude,double latitude) throws SQLException;//x
    public void updateLocationMessage(long ID,String name,double longitude,double latitude) ;//x
    public void deleteLocation(long ID) ;//x
    public List<Location> getAllLocations() ;//x
    public List<Location> getLocationWithin(Location origin,double radius) ;//x
}
