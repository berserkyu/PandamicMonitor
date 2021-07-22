package grp.pandemicmonitor.dataClasses.visit;


import grp.pandemicmonitor.InputFromFrontEnd.InputVisitElse;
import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.StreamSupport;

@Component
public class VisitDaoImple implements VisitDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public boolean addVisit(Visit s){
        System.out.println("xxxxxxxxx");
        String sqlCmd = String.format("INSERT INTO visit(idNo,locId,dateVisit,timeVisit) " +
                        "SELECT '%s',location.locId,'%s','%s' " +
                        "FROM location " +
                        "WHERE location.locId=%d ",
                s.getIdNo(),s.getDate().toString(),s.getTime().toString(),s.getLocId());
        System.out.println(sqlCmd);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    public List<Visit> getVisitedLocationsId(String idNo){
        String sqlQuery = String.format("SELECT * FROM visit WHERE idNo='%s'",idNo);
        List<Visit> result = jdbcTemplate.query(sqlQuery,new VisitMapper());
        return  result;
    }

    @Override
    public List<Location> getVisitedLocations(String idNo){
        String sqlQuery = String.format("SELECT location.locId,locName,province,city,area,address,cautionLevel FROM visit,location " +
                "WHERE location.locId=visit.locId " +
                "AND idNo='%s'",idNo);
        List<Location> l = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return  l;
    }

    @Override
    public boolean addVisitElse(InputVisitElse ive){
        String sqlCmd = String.format("INSERT INTO visitElse(idNo,locName,area,address) " +
                        "SELECT idNo,'%s','%s','%s' " +
                        "FROM person WHERE mail='%s'",
                ive.getLocName(),ive.getArea(),ive.getAddress(),ive.getMail());
        int update = jdbcTemplate.update(sqlCmd);
        return update==1;
    }

    @Override
    public List<Visit> getVisitList(String idNo){
        String sqlQuery = String.format("SELECT locId,dateVisit,timeVisit" +
                " FROM visit" +
                " WHERE idNo='%s'" +
                " ORDER BY dateVisit",idNo);
        return jdbcTemplate.query(sqlQuery,new VisitMapper());
    }
}