package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class LocationController {
    @Autowired
    private LocationDaoImple loc;

    @RequestMapping(value = "/location/add")
    public Result addLocation(Location l){
       if( loc.addLocation(l.getLocName(),l.getAddress())!=-1){
           return new Result(200);
       }
       return new Result(400);
    }

    @RequestMapping(value = "/location/change")
    public Result changeLocationInfo(Location l){
        if(loc.updateLocation(l.getID(),l.getLocName(),l.getAddress())){
            return  new Result(200);
        }
        return new Result(400);
    }

    @RequestMapping(value = "/location/delete")
    public Result deleteLocation(Location l){
        if(loc.deleteLocation(l.getID())) return new Result(200);
        return new Result(400);
    }
}
