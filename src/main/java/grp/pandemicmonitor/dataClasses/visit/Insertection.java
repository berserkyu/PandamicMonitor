package grp.pandemicmonitor.dataClasses.visit;

import java.sql.Date;
import java.sql.Time;

public class Insertection {
    String fullname,idNo,cautionName,cautionId,cautionLevel,province,city,area,address,locName;
    long locId;
    Date dateVisit;
    Time timeVisit;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCautionName() {
        return cautionName;
    }

    public void setCautionName(String cautionName) {
        this.cautionName = cautionName;
    }

    public String getCautionId() {
        return cautionId;
    }

    public void setCautionId(String cautionId) {
        this.cautionId = cautionId;
    }

    public String getCautionLevel() {
        return cautionLevel;
    }

    public void setCautionLevel(String cautionLevel) {
        this.cautionLevel = cautionLevel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public long getLocId() {
        return locId;
    }

    public void setLocId(long locId) {
        this.locId = locId;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Time getTimeVisit() {
        return timeVisit;
    }

    public void setTimeVisit(Time timeVisit) {
        this.timeVisit = timeVisit;
    }
}
