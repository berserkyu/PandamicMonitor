package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    PersonDaoImple per;


    @CrossOrigin
    @PostMapping(value = "/pandemicmonitor/loginVerify")
    @ResponseBody
    public Result verifyLogin(String mail,String pword){
        if(per.validateLogin(mail,pword)==null){
            return new Result(200);
        }else{
            return new Result(400);
        }
    }
}
