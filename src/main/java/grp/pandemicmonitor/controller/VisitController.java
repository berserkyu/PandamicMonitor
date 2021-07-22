package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.InputFromFrontEnd.InputVisit;
import grp.pandemicmonitor.InputFromFrontEnd.InputVisitElse;
import grp.pandemicmonitor.dataClasses.Results.Result;
import grp.pandemicmonitor.dataClasses.Results.ResultLocationList;
import grp.pandemicmonitor.dataClasses.Results.ResultVisitList;
import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
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
    public Result getVisitList(@RequestBody Person p){
        List<Visit> lv = vis.getVisitList(p.getIdNo());
        System.out.println(lv.get(0));

        if(lv.isEmpty()){
            return new ResultVisitList(400,lv);
        }
        //for(Location l :ll) l.displayInfo();
        return new ResultVisitList(200, lv);

    }
}
