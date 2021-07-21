package grp.pandemicmonitor.dataClasses.visit;

import java.sql.Time;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Visit {
    private String idNo;
    private long locId;
    private java.sql.Date date;
    private Time time;

    public String getIdNo() {
        return idNo;
    }
    public Visit(){
        this.idNo = "";
        this.locId = 0;
        this.date = Date.valueOf(LocalDate.now());
        this.time = Time.valueOf(LocalTime.now());
    }
    public Visit(String idNo, long locId, Date date, Time time) {
        this.idNo = idNo;
        this.locId = locId;
        this.date = Date.valueOf(LocalDate.now());
        this.time = Time.valueOf(LocalTime.now());
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public long getLocId() {
        return locId;
    }

    public void setLocId(long locId) {
        this.locId = locId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
