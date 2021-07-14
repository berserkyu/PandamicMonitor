package grp.pandemicmonitor.dataClasses.location;

import com.sun.xml.internal.ws.server.ServerRtException;
import grp.pandemicmonitor.dataClasses.Address;

public class Location {
    //每个地点唯一的ID，用0代表未赋值
    private long ID;
    //地点名字（例.商家名字）
    private String locName;
    //地址
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getID(){ return ID;}
    public String getLocName(){return locName;}
    public void setLocName(String locName) {
        this.locName = locName;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    public void displayInfo(){
        System.out.println(ID+" : "+locName+","+address.getProvince()+","+
                address.getCity()+","+address.getArea()+","+address);
    }
}

