package grp.pandemicmonitor.dataClasses.loginInfo;

public class PasswordChange {
    String mail;
    String oldPassword;
    String newPassword;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }



    public String getOldpassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewpassword() {
        return newPassword;
    }


}
