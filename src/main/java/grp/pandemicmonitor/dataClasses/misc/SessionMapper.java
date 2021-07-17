package grp.pandemicmonitor.dataClasses.misc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SessionMapper implements RowMapper<Session> {
    @Override
    public Session mapRow(ResultSet rs,int num) throws SQLException {
        Session session = new Session();
        session.setSessionId(rs.getInt("sessionId"));
        session.setMail(rs.getString("mail"));
        return session;
    }
}
