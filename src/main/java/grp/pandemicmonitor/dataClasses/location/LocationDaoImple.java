package grp.pandemicmonitor.dataClasses.location;

import java.sql.SQLException;
import java.util.List;

import grp.pandemicmonitor.dataClasses.Address;
import grp.pandemicmonitor.dataClasses.Result;


import com.sun.org.apache.regexp.internal.RE;
import grp.pandemicmonitor.dataClasses.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthEditorPaneUI;


@Component
public class LocationDaoImple implements LocationDao{


    @Autowired
    JdbcTemplate jdbcTemplate;

    //通过地点编号获取地点信息
    @Override
    public Location getLocation(long ID)  {
        String sqlQuery = String.format("SELECT * FROM Location WHERE locId=%d",ID);
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        if(result.isEmpty()){
            return  null;
        }else{
            return  result.get(0);
        }
    }
    //获得所有地点信息
    @Override
    public List<Location> getAllLocations()  {
        String sqlQuery = "SELECT * FROM Location";
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return result;
    }
    //此处运算假设地球是圆的
    //在数据库里定义GetDistance函数：利用半正矢公式计算两个坐标之间距离
    //获得origin地点半径radius距离内的所有地点信息
    @Override
    public List<Location> getLocationWithin(Location origin, double radius) {
        String sqlQuery = String.format("SELECT l2.locId,l2.locName,l2.longitude,l2.latitude " +
                                        "FROM location as l1,location as l2 " +
                                        "WHERE getDistance(l1.latitude,l1.longitude,l2.latitude,l2.longitude)<%f " +
                                        "AND l1.locId!=l2.locId " +
                                        "AND l1.locId=%d"
                                        ,radius,origin.getID());
        System.out.println(sqlQuery);
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        return  result;
    }
    //增加新地点
    @Override
    public long addLocation(String name, Address address) {
        String sqlCmd = String.format("INSERT INTO location(locName,province,city,area,address) " +
                                        " VALUES('%s','%s','%s','%s','%s')",
                                       name,address.getProvince(),address.getCity(),address.getArea(),
                                        address.getAddress());
        int result = jdbcTemplate.update(sqlCmd);
        if(result!=1) return -1;
        return result;
    }
    //删除地点信息
    @Override
    public boolean deleteLocation(long ID) {
        String sqlCmd = String.format("DELETE FROM location WHERE locId=%d",ID);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }
    //更新地点信息：将更新任何一项信息的动作都放到一个接口里
    @Override
    public boolean updateLocation(long ID, String name,Address address)  {
        String sqlCmd = String.format("UPDATE location  " +
                                        "SET locName='%s'," +
                                        "province='%s'," +
                                        "city='%s'" +
                                        "area='%s'" +
                                        "address='%s' " +
                                        "WHERE locId=%d"
                ,name,address.getProvince(), address.getCity(),
                address.getArea(),address.getAddress(),ID);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;
    }
}
