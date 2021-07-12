package grp.pandemicmonitor.controller;

import com.sun.org.apache.regexp.internal.RE;
import grp.pandemicmonitor.dataClasses.Result;
import grp.pandemicmonitor.dataClasses.newLoginInfo;
import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.person.PersonDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//信息更新相关Controller
@Controller
public class DataModificationController {
    //人员信息数据库接口
    @Autowired
    PersonDaoImple per;


    @RequestMapping(value = "updateuserinfo")
    @ResponseBody
    public Result updateUserInfo(@RequestBody Person p){
        //尝试更新并返回结果（成功/失败）
        if(per.changePersonalInfo(p.getIdNo(),p.getFullName(),p.getPhoneNo(),p.getAddress())){
            return  new Result(200);
        }else{
            return  new Result(400);
        }
    }

}
