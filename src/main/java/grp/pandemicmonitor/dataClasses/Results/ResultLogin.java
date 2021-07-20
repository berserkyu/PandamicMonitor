package grp.pandemicmonitor.dataClasses.Results;

public class ResultLogin extends Result{
    private int sessionID;

    public ResultLogin(int code,int ses){
        super(code);
        this.sessionID = ses;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }
}
