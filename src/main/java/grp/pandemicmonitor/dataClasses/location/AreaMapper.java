package grp.pandemicmonitor.dataClasses.location;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AreaMapper implements RowMapper<Area> {
    @Override
    public Area mapRow(ResultSet rs, int rowNum) throws SQLException {
        Area loc = new Area();
        loc.setArea(rs.getString("area"));
        loc.setCautionLevel(rs.getInt("cautionLevel"));
        loc.setProvince(rs.getString("province"));
        loc.setCity(rs.getString("city"));
        return loc;
    }
}
