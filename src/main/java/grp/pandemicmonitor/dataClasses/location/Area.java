package grp.pandemicmonitor.dataClasses.location;

public class Area {
    String area,province,city;

    public Area(String area, String province, String city, int cautionLevel) {
        this.area = area;
        this.province = province;
        this.city = city;
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

    int cautionLevel;

    public Area() {
    }

    public Area(String area, int cautionLevel) {
        this.area = area;
        this.cautionLevel = cautionLevel;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCautionLevel() {
        return cautionLevel;
    }

    public void setCautionLevel(int cautionLevel) {
        this.cautionLevel = cautionLevel;
    }
}
