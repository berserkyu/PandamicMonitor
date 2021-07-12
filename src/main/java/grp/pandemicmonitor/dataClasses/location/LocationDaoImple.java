package grp.pandemicmonitor.dataClasses.location;

import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthEditorPaneUI;


@Component
public class LocationDaoImple implements LocationDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Location getLocation(long ID)  {
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
    public List<Location> getAllLocations()  {
        String sqlQuery = "SELECT * FROM Location";
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return result;
    }
    //此处运算假设地球是圆的
    @Override
    public List<Location> getLocationWithin(Location origin, double radius) {
        String sqlQuery = String.format("SELECT l2.locId,l2.locName,l2.longitude,l2.latitude " +
                                        "FROM location as l1,location as l2 " +
                                        "WHERE getDistance(l1.latitude,l1.longitude,l2.latitude,l2.longitude)<%f " +
                                        "AND l1.locId!=l2.locId " +
                                        "AND l1.locId=%d"
                                        ,radius,origin.getID());
        System.out.println(sqlQuery);
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return  result;
    }

    @Override
    public void addLocation(String name, double longitude, double latitude) {
        String sqlCmd = String.format("INSERT INTO location(locName,longitude,latitude) " +
                                        " VALUES('%s',%f,%f)",
                                       name,longitude,latitude);
        System.out.println(sqlCmd);
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
    public void updateLocationMessage(long ID, String name, double longitude, double latitude)  {
        String sqlCmd = String.format("UPDATE location  " +
                                        "SET locName='%s'," +
                                        "longitude=%f," +
                                        "latitude=%f " +
                                        "WHERE locId=%d",name,longitude,latitude,ID);
        int result = jdbcTemplate.update(sqlCmd);
        if(result==1){

        }else{

        }
    }
}
