package grp.pandemicmonitor.dataClasses.Results;

import grp.pandemicmonitor.dataClasses.person.Person;

import java.util.List;

public class ResultPersonTest extends Result{
    List<Person> tableData;

    public ResultPersonTest(int code, List<Person> tableData) {
        super(code);
        this.tableData = tableData;
    }

    public ResultPersonTest(List<Person> tableData) {
        this.tableData = tableData;
    }

    public List<Person> getTableData() {
        return tableData;
    }

    public void setTableData(List<Person> tableData) {
        this.tableData = tableData;
    }
}
