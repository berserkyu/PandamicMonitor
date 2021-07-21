package grp.pandemicmonitor.dataClasses.location;

import java.util.List;
import grp.pandemicmonitor.dataClasses.Address.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class LocationDaoImple implements LocationDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    //通过地点编号获取地点信息
    @Override
    public Location getLocation(long ID)  {
        String sqlQuery = String.format("SELECT * FROM location WHERE locId=%d",ID);
        List<Location> result = jdbcTemplate.query(sqlQuery,new LocationMapper());
        if(result.isEmpty()){
            return  null;
        }else{
            return  result.get(0);
        }
    }

    @Override
    public List<Location> getLocation1(long ID)  {
        String sqlQuery = String.format("SELECT * FROM location WHERE locId=%d",ID);
        return jdbcTemplate.query(sqlQuery,new LocationMapper());
    }
    //获得所有地点信息
    @Override
    public List<Location> getAllLocations()  {
        String sqlQuery = "SELECT * FROM location";
        return jdbcTemplate.query(sqlQuery,new LocationMapper());
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
                                        ,radius,origin.getLocId());
        System.out.println(sqlQuery);
        return jdbcTemplate.query(sqlQuery,new LocationMapper());
    }
    //增加新地点
    @Override
    public long addLocation(Location l) {
        String sqlCmd = String.format("INSERT INTO location(locName,province,city,area,address) " +
                                        " VALUES('%s','%s','%s','%s','%s') ON DUPLICATE KEY UPDATE locName=locName",
                                       l.getLocName(),l.getProvince(),l.getCity(),l.getArea(), l.getAddress(),
                                        l.getLocName(),l.getProvince(),l.getCity(),l.getArea(), l.getAddress());
        int result = jdbcTemplate.update(sqlCmd);
        if(result!=1){
            System.out.println("add location result is not 1 : "+result);
            return -1;
        }
        sqlCmd = String.format("SELECT * FROM location WHERE locName='%s' " +
                                                        "AND province='%s' " +
                                                        "AND city='%s' " +
                                                        "AND area='%s' " +
                                                        "AND address='%s'",
                l.getLocName(),l.getProvince(),l.getCity(),l.getArea(), l.getAddress());
        List<Location> ll = jdbcTemplate.query(sqlCmd,new LocationMapper());
        System.out.println("locID returned "+ll.get(0).getLocId());
        return ll.get(0).getLocId();
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


    @Override
    public boolean updateLocationName(long ID,String name){
        String sqlCmd = String.format("UPDATE location  " +
                                    "SET locName='%s' "+
                                    "WHERE locId=%d",name,ID);
        int result = jdbcTemplate.update(sqlCmd);
        return result==1;

    }
    //得到在province省内的所有地点
    @Override
    public List<Location> getLocationWithinProvince(String province){
        String sqlQuery = String.format("SELECT * FROM location WHERE province='%s'",province);
        return jdbcTemplate.query(sqlQuery,new LocationMapper());
    }
    //得到在province省,city市内的所有地点
    @Override
    public List<Location> getLocationWithinCity(String province,String city){
        String sqlQuery = String.format("SELECT * FROM location WHERE province='%s' " +
                                        "AND city='%s'",province,city);
        return jdbcTemplate.query(sqlQuery,new LocationMapper());
    }
    //得到在province省,city市,area区内的所有地点
    @Override
    public List<Location> getLocationWithinArea(String province,String city,String area){
        String sqlQuery = String.format("SELECT * FROM location WHERE province='%s' " +
                                        "AND city='%s' " +
                                        "AND area='%s'",province,city,area);
        return  jdbcTemplate.query(sqlQuery,new LocationMapper());

    }

    //得到在province省,city市,area区内的address地点
    @Override
    public Location getLocationWithAddress(String province,String city,String area,String address){
        String sqlQuery = String.format("SELECT * FROM location WHERE province='%s' " +
                "AND city='%s' " +
                "AND area='%s' " +
                "AND address='%s' ",province,city,area,address);
        List<Location> ll = jdbcTemplate.query(sqlQuery,new LocationMapper());
        if(ll.isEmpty()) return null;
        return  ll.get(0);
    }
}
