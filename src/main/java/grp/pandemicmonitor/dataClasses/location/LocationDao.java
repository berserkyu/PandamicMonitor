package grp.pandemicmonitor.dataClasses.location;

import grp.pandemicmonitor.dataClasses.Address.Address;

import java.sql.SQLException;
import java.util.List;

//地点信息的数据库接口
public interface LocationDao  {
    //得到编号为ID的地点信息
    Location getLocation(long ID) ;//x
    List<Location> getLocation1(long ID) ;//x
    //新增地点
    long addLocation(Location l) throws SQLException;//x
    //更新地点信息（例。商家转移店铺）
    boolean updateLocation(long ID,String name,Address address) ;//x

    boolean updateLocationName(long ID,String name) ;//x
    //删除地点信息
    boolean deleteLocation(long ID) ;//x
    List<Location> getAllLocations() ;//x
    //得到在origin地点半径radius以内的所有地点
    List<Location> getLocationWithin(Location origin,double radius) ;//x

    //得到在province省内的所有地点
    List<Location> getLocationWithinProvince(String province);
    //得到在province省,city市内的所有地点
    List<Location> getLocationWithinCity(String province,String city);
    //得到在province省,city市,area区内的所有地点
    List<Location> getLocationWithinArea(String province,String city,String area);
    //得到在province省,city市,area区内的address地点
    Location getLocationWithAddress(String province,String city,String area,String address);

}
