package grp.pandemicmonitor.dataClasses.location;

import  org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationMapper  implements RowMapper<Location> {
    @Override
    public Location mapRow(ResultSet rs,int rowNum) throws SQLException{
        Location loc = new Location();
        loc.setID(rs.getLong("locId"));
        loc.setLocName(rs.getString("locName"));
        loc.setLatitude(rs.getDouble("latitude"));
        loc.setLongitude(rs.getDouble("longitude"));
        return loc;
    }
}
