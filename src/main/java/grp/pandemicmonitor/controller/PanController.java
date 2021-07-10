package grp.pandemicmonitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class PanController {
    @RequestMapping(value ="/PandamicMonitor")

    public @ResponseBody String say(String message){
        return "hello" + message;
    }

}
