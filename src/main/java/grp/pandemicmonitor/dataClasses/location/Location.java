package grp.pandemicmonitor.dataClasses.location;


public class Location {
    //每个地点唯一的ID，用0代表未赋值
    private long locId;
    //地点名字（例.商家名字）
    private String locName;
    //地址
    String address;
    String prefix;
    String province;
    String city;
    String area;
    int cautionLevel;

    public int getCautionLevel() {
        return cautionLevel;
    }

    public void setCautionLevel(int cautionLevel) {
        this.cautionLevel = cautionLevel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getAddress() {
        return address;
    }

    public void setPrefix(String prefix) {
        System.out.println("set prefix");
        this.prefix = prefix;
        String t = "";
        int n = prefix.length();
        for(int i = 0;i<n;i++){
            if(prefix.charAt(i)!=' ') t += prefix.charAt(i);
        }
        prefix = t;
        String[] strings = prefix.split("/");
        province = strings[0];
        city = strings[1];
        area = strings[2];
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



    public Location(){
        this.locId = -1;
        this.address = null;
        this.locName = "";
    }


    public long getLocId() {
        return locId;
    }

    public void setLocId(long locId) {
        this.locId = locId;
    }

    public String getLocName(){return locName;}

    public void setLocName(String locName) {
        this.locName = locName;
    }


    public void displayInfo(){
        System.out.println(locId+" : "+locName+","+province+","+city+","+area+","+address+",  "+cautionLevel);
    }
}

