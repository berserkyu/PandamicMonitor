package grp.pandemicmonitor.dataClasses.loginInfo;

public class PasswordChange {
    String oldPassword;
    String newPassword;

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
