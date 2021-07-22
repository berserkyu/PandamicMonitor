package grp.pandemicmonitor.dataClasses.Results;

import grp.pandemicmonitor.dataClasses.visit.Visit;

import java.util.List;

public class ResultVisitList extends Result{
    List<Visit> tableData;

    public ResultVisitList(int code, List<Visit> tableData) {
        super(code);
        this.tableData = tableData;
        System.out.println("code is "+code);
    }
}
