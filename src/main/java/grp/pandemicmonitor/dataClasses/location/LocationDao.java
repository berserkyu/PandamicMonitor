package grp.pandemicmonitor.dataClasses.location;

import java.sql.SQLException;
import java.util.List;

//地点信息的数据库接口
public interface LocationDao  {
    //得到编号为ID的地点信息
    public Location getLocation(long ID) ;//x
    //新增地点
    public void addLocation(String name,double longitude,double latitude) throws SQLException;//x
    //更新地点信息（例。商家转移店铺）
    public void updateLocationMessage(long ID,String name,double longitude,double latitude) ;//x
    //删除地点信息
    public void deleteLocation(long ID) ;//x
    public List<Location> getAllLocations() ;//x
    //得到在origin地点半径radius以内的所有地点
    public List<Location> getLocationWithin(Location origin,double radius) ;//x
}
