package grp.pandemicmonitor.dataClasses.Results;

//对于前端发送请求的回复
public class Result {
    //代表请求结果
    private int code;


    public Result(int code){
        this.code = code;
    }

    public Result(){
        this.code=0;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
