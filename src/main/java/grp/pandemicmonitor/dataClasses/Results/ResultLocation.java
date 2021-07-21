package grp.pandemicmonitor.dataClasses.Results;


//拓展地点数据的返回结果
public class ResultLocation extends Result{
    long locId;

    public ResultLocation(int code,long locId) {
        super(code);
        this.locId = locId;
    }

    public long getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }
}
