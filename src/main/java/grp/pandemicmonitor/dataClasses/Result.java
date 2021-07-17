package grp.pandemicmonitor.dataClasses;

//对于前端发送请求的回复
public class Result {
    //代表请求结果
    private int code;
    private int sessionID;

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public Result(int code){
        this.sessionID = 0;
        this.code = code;
    }

    public Result(int code,int ses){
        this.sessionID = ses;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
