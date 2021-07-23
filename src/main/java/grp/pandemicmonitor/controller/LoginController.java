package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.Results.ResultPersonTest;
import grp.pandemicmonitor.dataClasses.loginInfo.LoginInfo;
import grp.pandemicmonitor.dataClasses.loginInfo.PasswordChange;
import grp.pandemicmonitor.dataClasses.Results.Result;
import grp.pandemicmonitor.dataClasses.Results.ResultLogin;
import grp.pandemicmonitor.dataClasses.loginInfo.NewUserInfo;
import grp.pandemicmonitor.dataClasses.misc.GeneralDaoImple;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import grp.pandemicmonitor.dataClasses.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.CredentialException;
import java.util.List;

//登录相关行为的Controller
@Controller
public class LoginController {
    @Autowired
    PersonDaoImple per;
    @Autowired
    GeneralDaoImple gen;


    @RequestMapping( "/x")
    public String hello(){
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
            if(gen.initSession(sessionId,l.getMail())) return new ResultLogin(200,sessionId);
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
        System.out.println("change user info requested");
        System.out.println(newUserInfo.getOldMail()+","+ newUserInfo.getNewMail()+","+ newUserInfo.getName()+","+newUserInfo.getPhoneno()+","+newUserInfo.getAddress());
        if(per.changePersonalInfo(newUserInfo.getOldMail(), newUserInfo.getNewMail(), newUserInfo.getName(),newUserInfo.getPhoneno(),newUserInfo.getAddress())){
            return new Result(200);
        }
        return new Result(400);

    }

    @CrossOrigin
    @RequestMapping(value = "/getuserbymail")
    @ResponseBody
    public Person getUserByMail(@RequestBody Person p){
        return per.getPersonByMail(p.getMail());
    }

    @CrossOrigin
    @RequestMapping(value = "/getuserbyid")
    @ResponseBody
    public Person getUserById(@RequestBody String id){
        return per.getPersonById(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/getuserbyname")
    @ResponseBody
    public ResultPersonTest getUserByName(@RequestBody Person p){
        System.out.println("get user by name requested : "+p.getFullName());
        return new ResultPersonTest(200,per.getPersonByName(p.getFullName()));
    }
    //得到所有人员信息
    @CrossOrigin
    @RequestMapping(value = "/getalluser")
    @ResponseBody
    public ResultPersonTest getAllUser(){
        System.out.println("get all user requested");
        return new ResultPersonTest(200,per.getAllPerson());
    }
    //删除人员信息
    @CrossOrigin
    @RequestMapping(value = "/deleteuser")
    @ResponseBody
    public Result deleteUser(@RequestBody Person p){
        System.out.println("delete user requested : "+p.getIdNo());
        if(per.deletePerson(p.getIdNo())){
            return new Result(200);
        }
        return new Result(400);
    }

    @CrossOrigin
    @RequestMapping(value = "/setusercautionlv")
    @ResponseBody
    public Result setUserCautionLevel(@RequestBody Person p){
        System.out.println("change user caution level requested "+p.getMail()+" - "+p.getCautionLevel());
        if(per.setPersonCautionLevel(p.getMail(),p.getCautionLevel())){
            System.out.println("success");
            return new Result(200);
        }
        System.out.println("failure");
        return  new Result(400);
    }
}
