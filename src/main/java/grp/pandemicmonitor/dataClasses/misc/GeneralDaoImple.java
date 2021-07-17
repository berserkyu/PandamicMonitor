package grp.pandemicmonitor.dataClasses.misc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GeneralDaoImple implements GeneralDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public boolean initSession(int sessionID,String mail){
        String sqlCmd = String.format("INSERT INTO sessions VALUES('%d,'%s',now())",
                                    sessionID,mail);

        int result = jdbcTemplate.update(sqlCmd);
        return  result==1;
    }

    @Override
    public boolean checkSession(int sessionId){
        String sqlQuery = String.format("SELECT * FROM sessions WHERE sessionId=%d",sessionId);
        List<Session> l = jdbcTemplate.query(sqlQuery,new SessionMapper());
        return  l.isEmpty();
    }

    @Override
    public boolean endSession(int sessionId){
        String sqlCmd = String.format("DELETE FROM sessions WHERE sessionId=%d",sessionId);
        int result = jdbcTemplate.update(sqlCmd);
        return  result==1;
    }
}
