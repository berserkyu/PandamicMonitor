package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.InputFromFrontEnd.InputVisit;
import grp.pandemicmonitor.InputFromFrontEnd.InputVisitElse;
import grp.pandemicmonitor.dataClasses.Results.*;
import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import grp.pandemicmonitor.dataClasses.location.LocationVisit;
import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import grp.pandemicmonitor.dataClasses.visit.Insertection;
import grp.pandemicmonitor.dataClasses.visit.Visit;
import grp.pandemicmonitor.dataClasses.visit.VisitDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.util.List;

@Controller
public class VisitController {
    @Autowired
    VisitDaoImple vis;
    @Autowired
    PersonDaoImple per;
    @Autowired
    LocationDaoImple loc;

    @RequestMapping(value = "visit/addxx")
    @CrossOrigin
    @ResponseBody
    public Result addVisitInfo(@RequestBody Visit v){
        if(vis.addVisit(v)){
            return new Result(200);
        }
        return new Result(400);
    }

    @RequestMapping(value = "visit/add")
    @CrossOrigin
    @ResponseBody
    public Result addVisitInfoId(@RequestBody InputVisit iv){
        System.out.println("add visit requested "+iv);
        Person p = per.getPersonByMail(iv.getMail());

        if(vis.addVisit(new Visit(p.getIdNo(),iv.getLocId(),iv.getDate(),new Time(System.currentTimeMillis())))){
            return new Result(200);
        }
        return new Result(400);
    }

    @RequestMapping(value = "visit/addElse")
    @CrossOrigin
    @ResponseBody
    public Result addVisitInfoElse(@RequestBody InputVisitElse ive){
        if(vis.addVisitElse(ive)){
            return new Result(200);
        }
        return new Result(400);
    }

    @RequestMapping(value = "visit/showData")
    @CrossOrigin
    @ResponseBody
    public ResultLocationVisitList getVisitList(@RequestBody Person p){
        System.out.println("visit show data requested");
        List<LocationVisit> llv = loc.getLocationVisited(p.getIdNo());

        if(llv.isEmpty()){
            return new ResultLocationVisitList(400,llv);
        }
        return new ResultLocationVisitList(200, llv);

    }

    @RequestMapping(value = "visit/getintersections")
    @CrossOrigin
    @ResponseBody
    public ResultIntersect getAllInsertsections(@RequestBody Person p){
        List<Insertection> li = vis.getInterSections(p.getIdNo());
        System.out.println("get insersections requested  "+p.getIdNo());
        if(li.isEmpty()){
            return new ResultIntersect(400,li);
        }
        return new ResultIntersect(200,li);
    }
}
