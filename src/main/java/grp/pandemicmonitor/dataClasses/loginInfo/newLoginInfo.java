package grp.pandemicmonitor.dataClasses.loginInfo;

//对于登录信息的更新信息接收类
public class newLoginInfo {
    //新、旧登录信息
    String oldmail,newmail,oldpword,newpword;

    public String getOldmail() {
        return oldmail;
    }

    public void setOldmail(String oldmail) {
        this.oldmail = oldmail;
    }

    public String getNewmail() {
        return newmail;
    }

    public void setNewmail(String newmail) {
        this.newmail = newmail;
    }

    public String getOldpword() {
        return oldpword;
    }

    public void setOldpword(String oldpword) {
        this.oldpword = oldpword;
    }

    public String getNewpword() {
        return newpword;
    }

    public void setNewpword(String newpword) {
        this.newpword = newpword;
    }
}
