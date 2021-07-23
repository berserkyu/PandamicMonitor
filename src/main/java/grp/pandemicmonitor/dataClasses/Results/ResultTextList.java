package grp.pandemicmonitor.dataClasses.Results;

import grp.pandemicmonitor.dataClasses.location.Location;

import java.util.List;

public class ResultTextList extends Result{
    List<String> primaryData;
    List<List<String>> secondaryData;

    public ResultTextList(int code, List<String> primaryData, List<List<String>> secondaryData) {
        super(code);
        this.primaryData = primaryData;
        this.secondaryData = secondaryData;
    }

    public ResultTextList(List<String> primaryData, List<List<String>> secondaryData) {
        this.primaryData = primaryData;
        this.secondaryData = secondaryData;
    }

    public List<String> getPrimaryData() {
        return primaryData;
    }

    public void setPrimaryData(List<String> primaryData) {
        this.primaryData = primaryData;
    }

    public List<List<String>> getSecondaryData() {
        return secondaryData;
    }

    public void setSecondaryData(List<List<String>> secondaryData) {
        this.secondaryData = secondaryData;
    }
}
