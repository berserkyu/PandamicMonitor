package grp.pandemicmonitor.dataClasses.loginInfo;

//登录信息类
public class LoginInfo {
    String mail;
    String password;
    //账号类型：管理员，疫调员，普通用户等
    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
