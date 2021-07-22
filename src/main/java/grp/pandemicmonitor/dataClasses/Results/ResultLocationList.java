package grp.pandemicmonitor.dataClasses.Results;

import grp.pandemicmonitor.dataClasses.location.Location;

import java.util.List;

public class ResultLocationList extends Result{
    List<Location> tableData;

    public List<Location> getTableData() {
        return tableData;
    }

    public void setTableData(List<Location> tableData) {
        this.tableData = tableData;
    }

    public ResultLocationList(int code, List<Location> tableData) {
        super(code);
        this.tableData = tableData;
        System.out.println("code is "+code);
    }

    public ResultLocationList(List<Location> tableData) {
        this.tableData = tableData;
    }
}
