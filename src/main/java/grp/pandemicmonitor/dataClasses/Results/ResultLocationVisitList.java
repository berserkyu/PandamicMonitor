package grp.pandemicmonitor.dataClasses.Results;

import grp.pandemicmonitor.dataClasses.location.LocationVisit;

import java.util.List;

public class ResultLocationVisitList extends Result{
    List<LocationVisit> tableData;

    public ResultLocationVisitList(int code, List<LocationVisit> tableData) {
        super(code);
        this.tableData = tableData;
    }

    public ResultLocationVisitList(List<LocationVisit> tableData) {
        this.tableData = tableData;
    }

    public List<LocationVisit> getTableData() {
        return tableData;
    }

    public void setTableData(List<LocationVisit> tableData) {
        this.tableData = tableData;
    }
}
