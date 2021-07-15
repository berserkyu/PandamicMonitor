package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.location.LocationDaoImple;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PanController {
    @Autowired
    LocationDaoImple loc;
    @Autowired
    PersonDaoImple per;
    //测试用函数
    @RequestMapping(value ="/test")
    public @ResponseBody String say(@RequestBody String message){
        return "test001";
    }


}
