package grp.pandemicmonitor.dataClasses.location;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class LocationDaoImple implements LocationDao{
    private JdbcTemplate jdbcTemplate;

    @Override
    public Location getLocation(long ID) {
        String sqlQuery = String.format("SELECT * FROM Location WHERE locId=%d",ID);
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        if(result.isEmpty()){
            return  null;
        }else{
            return  result.get(0);
        }
    }
    //可能会导致程序内存不够用
    @Override
    public List<Location> getAllLocations() {
        String sqlQuery = "SELECT * FROM Location";
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return result;
    }
    //此处运算假设地球是圆的
    @Override
    public List<Location> getLocationWithin(Location origin, double radius) {
        String sqlQuery = String.format("SELECT * " +
                                        "FROM location as l1,location as l2 " +
                                        "WHERE getDistance(l1.latitude,l1.longitude,l2.latitude,l2.longtitude)<%a"
                                        ,radius);
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return  result;
    }

    @Override
    public void addLocation(String name, double longitude, double latitude) {
        String sqlCmd = String.format("INSERT INTO location(locName,longitude,latitude) " +
                                        " VALUES(%s,%a,%a)",
                                       name,longitude,latitude);
        int result = jdbcTemplate.update(sqlCmd);
        if(result==1){

        }else {

        }
    }

    @Override
    public void deleteLocation(long ID) {
        String sqlCmd = String.format("DELETE FROM location WHERE locId=%d",ID);
        int result = jdbcTemplate.update(sqlCmd);
        if(result==1){

        }else{

        }
    }

    @Override
    public void updateLocationMessage(long ID, String name, double longitude, double latitude) {
        String sqlCmd = String.format("UPDATE location WHERE locId=%d " +
                                        "SET locName=%s," +
                                        "longitude=%a" +
                                        "latitude=%a",ID,longitude,latitude);
        int result = jdbcTemplate.update(sqlCmd);
        if(result==1){

        }else{

        }
    }
}
