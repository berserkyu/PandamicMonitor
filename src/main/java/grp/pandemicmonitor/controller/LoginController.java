package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.loginInfo.LoginInfo;
import grp.pandemicmonitor.dataClasses.loginInfo.PasswordChange;
import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.loginInfo.NewUserInfo;
import grp.pandemicmonitor.dataClasses.misc.GeneralDaoImple;
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
    @Autowired
    GeneralDaoImple gen;


    @RequestMapping( "/x")
    public String hello(){
        System.out.println("shit");
        return "index";
    }

    @CrossOrigin
    @RequestMapping(value = "/checksession")
    @ResponseBody
    public Result checkSession(@RequestBody int sessionId){
        if(gen.checkSession(sessionId)){
            return new Result(200);
        }
        return  new Result(400);
    }

    @CrossOrigin
    @RequestMapping(value = "/endsession")
    @ResponseBody
    public Result endSession(@RequestBody int sessionId){
        if(gen.endSession(sessionId)){
            return new Result(200);
        }
        System.out.println("end session unsuccessful "+sessionId);
        return new Result(400);
    }


    @CrossOrigin
    @RequestMapping(value = "/login")
    @ResponseBody
    public Result verifyLogin(@RequestBody LoginInfo l){
        Person p = per.validateLogin(l.getMail(),l.getPassword(),l.getType());
        System.out.println("login request:  " +l.getMail()+"  "+l.getPassword()+"  "+l.getType());
        if(p!=null){
            p.displayInfo();
            int sessionId = LoginInfo.hash(l.getMail()+l.getPassword());
            //返回200代表验证通过
            if(gen.initSession(sessionId,l.getMail())) return new Result(200,sessionId);
            //返回400代表验证不通过
            System.out.println("init session failed");
        }
        System.out.println("person is null");
        return new Result(400);

    }

    //注册新用户
    @CrossOrigin
    @RequestMapping(value = "/register")
    @ResponseBody
    public Result register(@RequestBody Person p){
        System.out.println("register requested ");
        p.displayInfo();
        if(per.addPerson(p,p.getPassword())){
            return new Result(200);
        }
        return new Result(400);
    }

    //更新登录信息
    //更新邮箱与密码都通过此接口
    @CrossOrigin
    @RequestMapping(value = "/changelogininfo")
    @ResponseBody
    public Result updateUserPassword( @RequestBody PasswordChange passwordChange){
        System.out.println("update password requested :"+passwordChange.getMail()+" : "+passwordChange.getOldpassword()+" to "+passwordChange.getNewpassword());
        //先更新邮箱
        if(!(per.changePassword(passwordChange.getMail(), passwordChange.getOldpassword(), passwordChange.getNewpassword()))){
            return  new Result(400);
        }
        return  new Result(200);
    }

    @CrossOrigin
    @RequestMapping(value = "/changeuserinfo")
    @ResponseBody
    public Result changeUserInfo(@RequestBody NewUserInfo newUserInfo){
        if(per.changePersonalInfo("000001",newUserInfo.getName(),newUserInfo.getPhoneno(),newUserInfo.getAddress())){
            return new Result(200);
        }
        return new Result(400);

    }

    @CrossOrigin
    @RequestMapping(value = "/getuser")
    @ResponseBody
    public Person getUser(@RequestBody String mail){
        return per.getPersonByMail(mail);
    }
}
