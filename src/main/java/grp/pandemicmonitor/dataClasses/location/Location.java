package grp.pandemicmonitor.dataClasses.location;


import com.sun.xml.internal.ws.server.ServerRtException;
import grp.pandemicmonitor.dataClasses.Address.Address;

public class Location {
    //每个地点唯一的ID，用0代表未赋值
    private long ID;
    //地点名字（例.商家名字）
    private String locName;
    //地址
    String address;
    String prefix;
    String province;
    String city;

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

    String area;


    public Location(){
        System.out.println("location");
        this.ID = -1;
        this.address = null;
        this.locName = "";
    }

    public Location(long ID,String locName,String prefix,String address){
        System.out.println("prefix"+prefix+"x");
        this.ID = ID;
        this.address = null;
        this.locName = locName;
    }




    public long getID(){ return ID;}
    public String getLocName(){return locName;}

    public void setLocName(String locName) {
        System.out.println("locname "+locName);
        this.locName = locName;
    }
    public void setID(long ID) {
        System.out.println("id "+ID);
        this.ID = ID;
    }

    public void displayInfo(){
        System.out.println(ID+" : "+locName+","+province+","+city+","+area+","+address);
        System.out.println(ID+" : "+locName.length()+","+province.length()+","+city.length()+","+area.length()+","+address.length());
    }
}

