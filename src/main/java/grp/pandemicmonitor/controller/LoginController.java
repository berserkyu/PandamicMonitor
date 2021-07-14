package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.LoginInfo;
import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.newLoginInfo;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import grp.pandemicmonitor.dataClasses.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//登录相关行为的Controller
@Controller
public class LoginController {
    @Autowired
    PersonDaoImple per;

    @RequestMapping( "/x")
    public String hello(){
        System.out.println("shit");
        return "index";
    }


    @CrossOrigin
    @RequestMapping(value = "/login")
    @ResponseBody
    //收到登录请求 验证登录信息
    public Result verifyLogin(@RequestBody LoginInfo l){
        Person p = per.validateLogin(l.getMail(),l.getPassword(),l.getType());
        System.out.println("login request:  " +l.getMail()+"  "+l.getPassword()+"  "+l.getType());
        if(p!=null){
            p.displayInfo();
            //返回200代表验证通过
            return new Result(200);
        }else{
            System.out.println("person is null");
            //返回400代表验证不通过
            return new Result(400);
        }
    }

    //注册新用户
    @CrossOrigin
    @RequestMapping(value = "/register")
    @ResponseBody
    public Result register(@RequestBody Person p){
        System.out.println("register requested");
        if(per.addPerson(p,p.getPassword())){
            return new Result(200);
        }
        return new Result(400);
    }

    //更新登录信息
    //更新邮箱与密码都通过此接口
    @CrossOrigin
    @RequestMapping(value = "changelogininfo")
    @ResponseBody
    public Result updateUserLoginInfo(newLoginInfo nl){
        //先更新邮箱
        if(!per.changePersonMail(nl.getOldmail(),nl.getOldmail())
                || !per.changePassword(nl.getNewmail(),nl.getOldpword(),nl.getNewpword()) ){
            return  new Result(400);
        }
        return  new Result(200);
    }
}
