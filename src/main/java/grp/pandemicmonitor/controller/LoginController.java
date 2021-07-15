package grp.pandemicmonitor.controller;

import grp.pandemicmonitor.dataClasses.loginInfo.LoginInfo;
import grp.pandemicmonitor.dataClasses.loginInfo.PasswordChange;
import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.loginInfo.NewUserInfo;
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



    //收到登录请求 验证登录信息
    //HttpServletRequest request, HttpServletResponse response, @RequestParam("name1")String name
    /*
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
    */
    @CrossOrigin
    @RequestMapping(value = "/login")
    @ResponseBody
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

  /*  @CrossOrigin
    @RequestMapping(value = "/login")
    //设置cookie
    public String setLoginCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("mail","xxxxxx");
        response.addCookie(cookie);
        return  "CookieAdded";
    }*/



    //注册新用户
    @CrossOrigin
    @RequestMapping(value = "/register")
    @ResponseBody
    public Result register(@RequestBody Person p){
        System.out.println("register requested ");
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
        System.out.println("update password requested :"+passwordChange.getOldpassword()+" to "+passwordChange.getNewpassword());

        /* Cookie[] cookies = request.getCookies();

        for (Cookie cookie:cookies){
            if(cookie.getName().equals("pandemicMail")){
                mail = cookie.getValue();
            }
        }*/
        //先更新邮箱
        if(!(per.changePassword("changed@hotmail.com",passwordChange.getOldpassword(), passwordChange.getNewpassword()))){
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
}
