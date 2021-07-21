package grp.pandemicmonitor.dataClasses.location;

import  org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

//数据库与地点信息的映射
public class LocationMapper  implements RowMapper<Location> {
    @Override
    public Location mapRow(ResultSet rs,int rowNum) throws SQLException{
        Location loc = new Location();
        loc.setLocId(rs.getLong("locId"));
        loc.setLocName(rs.getString("locName"));
        loc.setProvince(rs.getString("province"));
        loc.setCity(rs.getString("city"));
        loc.setArea(rs.getString("area"));
        loc.setAddress(rs.getString("address"));
        loc.setCautionLevel(rs.getInt("cautionLevel"));
        return loc;
    }
}
