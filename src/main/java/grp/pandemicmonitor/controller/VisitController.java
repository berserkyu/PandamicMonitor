package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.visit.Visit;
import grp.pandemicmonitor.dataClasses.visit.VisitDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VisitController {
    @Autowired
    VisitDaoImple vis;

    @RequestMapping(value = "visit/add")
    @CrossOrigin
    @ResponseBody
    public Result addVisitInfo(@RequestBody Visit v){
        if(vis.addVisit(v)){
            return new Result(200);
        }
        return new Result(400);
    }


}
