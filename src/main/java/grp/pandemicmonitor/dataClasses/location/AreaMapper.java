package grp.pandemicmonitor.dataClasses.location;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AreaMapper implements RowMapper<Location> {
    @Override
    public Location mapRow(ResultSet rs, int rowNum) throws SQLException {
        Location loc = new Location();
        loc.setArea(rs.getString("area"));
        loc.setCautionLevel(rs.getInt("cautionLevel"));
        return loc;
    }
}
