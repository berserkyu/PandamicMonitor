package grp.pandemicmonitor.dataClasses.location;

import java.sql.SQLException;
import java.util.List;

public interface LocationDao  {
    public Location getLocation(long ID) throws SQLException;
    public void addLocation(String name,double longitude,double latitude) throws SQLException;
    public void updateLocationMessage(long ID,String name,double longitude,double latitude) throws SQLException;
    public void deleteLocation(long ID) throws SQLException;
    public List<Location> getAllLocations() throws SQLException;
    public List<Location> getLocationWithin(Location origin,double radius) throws SQLException;
}
