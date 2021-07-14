package grp.pandemicmonitor.dataClasses.location;

import grp.pandemicmonitor.dataClasses.Address;
import  org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//数据库与地点信息的映射
public class LocationMapper  implements RowMapper<Location> {
    @Override
    public Location mapRow(ResultSet rs,int rowNum) throws SQLException{
        Location loc = new Location();
        loc.setID(rs.getLong("locId"));
        loc.setLocName(rs.getString("locName"));
        loc.setAddress(new Address(rs.getString("province"),rs.getString("city"),
                rs.getString("area"),rs.getString("address")));
        return loc;
    }
}
