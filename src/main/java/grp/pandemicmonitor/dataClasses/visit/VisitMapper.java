package grp.pandemicmonitor.dataClasses.visit;

import org.springframework.jdbc.core.RowMapper;
import grp.pandemicmonitor.dataClasses.visit.Visit;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VisitMapper implements RowMapper<Visit> {
    @Override
    public Visit mapRow(ResultSet rs,int num)throws SQLException {
        Visit v = new Visit();
        v.setIdNo(rs.getString("idNo"));
        v.setLocId(rs.getLong("locId"));
        v.setDate(rs.getDate("dateVisit"));
        v.setTime(rs.getTime("timeVisit"));
        return v;
    }

}
