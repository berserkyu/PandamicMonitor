package grp.pandemicmonitor.dataClasses.location;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationVisitMapper implements RowMapper<LocationVisit> {
    @Override
    public LocationVisit mapRow(ResultSet rs,int num)throws SQLException {
        LocationVisit lv = new LocationVisit();
        lv.setLocId(rs.getLong("locId"));
        lv.setLocName(rs.getString("locName"));
        lv.setProvince(rs.getString("province"));
        lv.setCity(rs.getString("city"));
        lv.setArea(rs.getString("area"));
        lv.setAddress(rs.getString("address"));
        lv.setCautionLevel(rs.getInt("cautionLevel"));
        lv.setDateVisit(rs.getDate("dateVisit"));
        lv.setTimeVisit(rs.getTime("timeVisit"));
        return lv;
    }
}
