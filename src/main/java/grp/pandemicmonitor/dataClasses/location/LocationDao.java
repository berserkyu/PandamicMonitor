package grp.pandemicmonitor.dataClasses.location;

import grp.pandemicmonitor.dataClasses.Address;
import grp.pandemicmonitor.dataClasses.Result;

import java.sql.SQLException;
import java.util.List;

//地点信息的数据库接口
public interface LocationDao  {
    //得到编号为ID的地点信息
    public Location getLocation(long ID) ;//x
    //新增地点
    public long addLocation(String name, Address address) throws SQLException;//x
    //更新地点信息（例。商家转移店铺）
    public boolean updateLocation(long ID,String name,Address address) ;//x
    //删除地点信息
    public boolean deleteLocation(long ID) ;//x
    public List<Location> getAllLocations() ;//x
    //得到在origin地点半径radius以内的所有地点
    public List<Location> getLocationWithin(Location origin,double radius) ;//x

}
