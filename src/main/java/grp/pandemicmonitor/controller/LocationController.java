package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.Address.Address;
import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//和地点信息相关的Controller
@Controller
public class LocationController {
    @Autowired
    private LocationDaoImple loc;

    //新增地点
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/location/add")
    @ResponseBody
    public Result addLocation(@RequestBody Location l){
        System.out.println("add location requested");
        l.displayInfo();
       if(loc.addLocation(l)!=-1){
           return new Result(200);
       }
       return new Result(400);
    }
    //改变现有地点信息
    @RequestMapping(value = "/location/change")
    @CrossOrigin
    @ResponseBody
    public Result changeLocationInfo(Location l){
        if(loc.updateLocation(l.getID(),l.getLocName(),new Address("",""))){
            return  new Result(200);
        }
        return new Result(400);
    }
    //删除地点信息
    @RequestMapping(value = "/location/delete")
    @CrossOrigin
    @ResponseBody
    public Result deleteLocation(Location l){
        if(loc.deleteLocation(l.getID())) return new Result(200);
        return new Result(400);
    }
}
