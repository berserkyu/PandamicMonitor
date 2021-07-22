package grp.pandemicmonitor.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Random;
import grp.pandemicmonitor.dataClasses.location.Location;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import grp.pandemicmonitor.dataClasses.visit.Visit;
import grp.pandemicmonitor.dataClasses.visit.VisitDaoImple;
import javafx.fxml.LoadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PanController {
    @Autowired
    VisitDaoImple vis;
    @Autowired
    PersonDaoImple per;
    @Autowired
    LocationDaoImple loc;

    @RequestMapping(value ="/test")
    public @ResponseBody String say(){
        Random random = new Random();
        List<Person> lp = per.getAllPerson();
        for(int i=0;i<10;i++){
            List<Location> locations = vis.getVisitedLocations(lp.get(i).getIdNo());
            for(Location l:locations){
                System.out.print(lp.get(i).getIdNo()+" visited ");
                l.displayInfo();
            }
            System.out.println("");
        }
        return "test001";
    }


}
