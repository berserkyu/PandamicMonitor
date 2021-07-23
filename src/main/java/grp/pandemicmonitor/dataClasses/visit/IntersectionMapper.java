package grp.pandemicmonitor.dataClasses.visit;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IntersectionMapper implements RowMapper<Insertection> {
    public Insertection mapRow(ResultSet rs,int n)throws SQLException {
        Insertection insertection = new Insertection();
        insertection.setIdNo(rs.getString("idNo"));
        insertection.setFullname(rs.getString("fullname"));
        insertection.setCautionId(rs.getString("cautionId"));
        insertection.setCautionName(rs.getString("cautionName"));
        insertection.setCautionLevel(rs.getString("cautionLevel"));
        insertection.setLocId(rs.getLong("locId"));
        insertection.setLocName(rs.getString("locName"));
        insertection.setProvince(rs.getString("province"));
        insertection.setCity(rs.getString("city"));
        insertection.setArea(rs.getString("area"));
        insertection.setAddress(rs.getString("address"));
        insertection.setDateVisit(rs.getDate("dateVisit"));
        insertection.setTimeVisit(rs.getTime("timeVisit"));
        return  insertection;
    }
}
