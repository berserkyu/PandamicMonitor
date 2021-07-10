package grp.pandemicmonitor.dataClasses.person;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs,int rowNum)throws SQLException {
        Person p = new Person();
        p.setIdNo(rs.getString("idno"));
        p.setMail(rs.getString("mail"));
        p.setBirthday(rs.getDate("birthday"));
        p.setFullName(rs.getString("fullName"));
        p.setPhoneNo(rs.getString("phoneNo"));
        p.setAddress(rs.getString("address"));
        p.setAge(rs.getInt("age"));
        p.setGender(rs.getString("gender"));
        return  p;
    }
}
