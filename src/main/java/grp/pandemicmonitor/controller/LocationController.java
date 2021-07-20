package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.Address.Address;
import grp.pandemicmonitor.dataClasses.Results.Result;
import grp.pandemicmonitor.dataClasses.Results.ResultLocation;
import grp.pandemicmonitor.dataClasses.Results.ResultLocationList;
import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//和地点信息相关的Controller
@Controller
public class LocationController {
    @Autowired
    private LocationDaoImple loc;

    //新增地点
    @CrossOrigin
    @RequestMapping(value = "/location/add")
    @ResponseBody
    public ResultLocation addLocation(@RequestBody Location l){
        System.out.println("add location requested");
        l.displayInfo();
        long r = loc.addLocation(l);
       if(r!=-1){
           return new ResultLocation(200,r);
       }
       return new ResultLocation(400,0);
    }
    //改变现有地点信息
    @RequestMapping(value = "/location/change")
    @CrossOrigin
    @ResponseBody
    public Result changeLocationInfo(@RequestBody Location l){
        if(loc.updateLocation(l.getLocId(),l.getLocName(),new Address(l.getProvince(),l.getCity(),l.getArea(),l.getAddress()))){
            return  new Result(200);
        }
        return new Result(400);
    }

    //改变现有地点信息
    @RequestMapping(value = "/location/changename")
    @CrossOrigin
    @ResponseBody
    public Result changeLocationName(@RequestBody Location l){
        if(loc.updateLocationName(l.getLocId(),l.getLocName())){
            return  new Result(200);
        }
        return new Result(400);
    }
    //删除地点信息
    @RequestMapping(value = "/location/delete")
    @CrossOrigin
    @ResponseBody
    public Result deleteLocation(@RequestBody Location l){
        System.out.println("delete location requested "+l.getLocId());
        if(loc.deleteLocation(l.getLocId())) return new Result(200);
        return new Result(400);
    }

    //得到某一地点信息
    @RequestMapping(value = "location/get")
    @CrossOrigin
    @ResponseBody
    public ResultLocationList getLocation(@RequestBody Location location){
        System.out.println("location info requested"+location.getLocId());
        List<Location> ll= loc.getLocation1(location.getLocId());
        if(ll.isEmpty()){
            return  new ResultLocationList(400,ll);
        }
        return new ResultLocationList(200,ll);
    }

    @RequestMapping(value = "/location/getall")
    @CrossOrigin
    @ResponseBody
    public ResultLocationList getAllLocation(){
        List<Location> ll = loc.getAllLocations();
        System.out.println("get all location requested xxx "+ll.size());
        if(ll.isEmpty()){
            return new ResultLocationList(400,ll);
        }
        //for(Location l :ll) l.displayInfo();
        return new ResultLocationList(200, ll);
    }

    @RequestMapping(value = "location/getprovince")
    @CrossOrigin
    @ResponseBody
    public List<Location> getLocationWithinProvince(@RequestBody String province){
        return loc.getLocationWithinProvince(province);
    }

    @RequestMapping(value = "location/getcity")
    @CrossOrigin
    @ResponseBody
    public List<Location> getLocationWihtinCity(@RequestBody Address a){
        return loc.getLocationWithinCity(a.getProvince(),a.getCity());
    }

    @RequestMapping(value = "location/getarea")
    @CrossOrigin
    @ResponseBody
    public List<Location> getLocationWihtinArea(@RequestBody Address a){
        return loc.getLocationWithinArea(a.getProvince(),a.getCity(),a.getArea());
    }

    @RequestMapping(value = "location/getaddress")
    @CrossOrigin
    @ResponseBody
    public Location getLocationWithAddress(@RequestBody Address a){
        return  loc.getLocationWithAddress(a.getProvince(),a.getCity(),a.getArea(),a.getAddress());
    }


}
