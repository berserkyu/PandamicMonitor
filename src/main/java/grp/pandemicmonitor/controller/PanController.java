package grp.pandemicmonitor.controller;

import com.zaxxer.hikari.util.SuspendResumeLock;
import grp.pandemicmonitor.dataClasses.Address;
import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.person.PersonDao;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Controller
public class PanController {
    @Autowired
    LocationDaoImple loc;
    @Autowired
    PersonDaoImple per;

    @RequestMapping(value ="/test")
    public @ResponseBody String say(@RequestBody String message){
        System.out.println("shitttttt");
        Address address = new Address("湖北省","武汉市","武昌区","武汉大学");
        long x = loc.addLocation("武汉大学",address);
        if(x!=-1){
            System.out.println("Add Location Failed");
        }else{
            Location location = loc.getLocation(x);
            location.displayInfo();
        }
        return "xxxxx";
    }


}
