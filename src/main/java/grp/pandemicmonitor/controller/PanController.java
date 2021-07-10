package grp.pandemicmonitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PandamicMonitor")
public class PanController {

    public String say(String message){
        return "hello" + message;
    }

}
