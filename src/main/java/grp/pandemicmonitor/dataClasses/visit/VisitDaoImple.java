package grp.pandemicmonitor.dataClasses.visit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VisitDaoImple implements VisitDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public boolean addVisit(Visit s){
        String sqlCmd = String.format("INSERT INTO visit(idNo,locId,dateVisit,timeVisit) " +
                        "VALUES ('%s',%d,'%s','%s')",
                s.getIdNo(),s.getLocId(),s.getDate().toString(),s.getTime().toString());
        int result = jdbcTemplate.update(sqlCmd);
        return  result==1;
    }
    @Override
    public List<Visit> getVisitedLocations(String idNo){
        String sqlQuery = String.format("SELECT * FROM visit WHERE idNo='%s'",idNo);
        List<Visit> result = jdbcTemplate.query(sqlQuery,new VisitMapper());
        return  result;
    }
}
