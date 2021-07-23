package grp.pandemicmonitor.dataClasses.Results;

import grp.pandemicmonitor.dataClasses.person.Person;
import grp.pandemicmonitor.dataClasses.visit.Insertection;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class ResultIntersect extends Result{
    public ResultIntersect(int code, List<Insertection> tableData) {
        super(code);
        this.tableData = tableData;
    }

    public ResultIntersect(List<Insertection> tableData) {
        this.tableData = tableData;
    }

    public List<Insertection> getTableData() {
        return tableData;
    }

    public void setTableData(List<Insertection> tableData) {
        this.tableData = tableData;
    }

    List<Insertection> tableData;


}
