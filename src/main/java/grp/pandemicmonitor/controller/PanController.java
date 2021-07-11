package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

@Controller

public class PanController {
    @Autowired
    LocationDaoImple loc;
    @Autowired
    PersonDaoImple per;
    @RequestMapping(value ="/PandamicMonitor")
    public @ResponseBody String say(String message){

        return "hello" + message;
    }

}
