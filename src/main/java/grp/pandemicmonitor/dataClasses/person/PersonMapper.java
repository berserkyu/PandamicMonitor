package grp.pandemicmonitor.dataClasses.person;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//将数据库里的person转化为java里的person对象
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
       // p.setAddress(new Address(rs.getString("province"),rs.getString("city"),rs.getString("area"),rs.getString("addresss")));
        p.setAge(rs.getInt("age"));
        p.setGender(rs.getString("gender"));
        p.setPassword("");
        return  p;
    }
}
