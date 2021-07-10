package grp.pandemicmonitor.dataClasses.person;

import grp.pandemicmonitor.dataClasses.location.Location;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Time;
import java.util.List;

public class PersonDaoImple implements PersonDao {
    JdbcTemplate jdbcTemplate;
    @Override
    public Person getPerson(String idNo) {
        String sqlQuery = String.format("SELECT * FROM person WHERE idno=%s",idNo);
        List<Person> result = jdbcTemplate.query(sqlQuery,new PersonMapper());
        if(result.isEmpty()){
            return null;
        }else{
            return result.get(0);
        }
    }

    @Override
    public boolean addPerson(Person p) {
        String sqlCmd = String.format("INSERT INTO person(idno,mail,birthDay,fullname,phoneno" +
                                    ",address,age,gender) VALUES(%s,%s,%s,%s,%s,%s,%d,%s)",
                                    p.getIdNo(),p.getMail(),p.getBirthday(),p.getFullName(),
                                    p.getPhoneNo(),p.getAddress(),p.getAge(),p.getGender());
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    public boolean changePersonalInfo(String idNo, String fullName, String phoneNo, String address) {
        String sqlCmd = String.format("UPDATE person WHERE idno=%s " +
                                    " SET fullname=%s,phoneno=%s,address=%s",
                                    fullName,phoneNo,address);
        int result = jdbcTemplate.update(sqlCmd);
        return  result==1;
    }

    @Override
    public boolean changePersonMail(String oldMail, String newMail) {
        String sqlCmd = String.format("CALL updateMail(%s,%s)",
                                    oldMail,newMail);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }

    @Override
    public void deletePerson(String idNo) {

    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }

    @Override
    public List<Person> getAllPersonInvolvedInRoute(List<Location> route) {
        return null;
    }

    @Override
    public List<Person> getAllPersonVisited(Location loc) {
        return null;
    }

    @Override
    public List<Person> getAllPersonVisitedBefore(Location loc, Time time) {
        return null;
    }
}
