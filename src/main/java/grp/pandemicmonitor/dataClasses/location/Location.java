package grp.pandemicmonitor.dataClasses.location;

public class Location {
    //每个地点唯一的ID，用0代表未赋值
    private long ID;
    //地点名字（例.商家名字）
    private String locName;
    //经、纬度
    private  double longitude,latitude;

    public long getID(){ return ID;}
    public String getLocName(){return locName;}
    public double getLongitude(){return longitude;}
    public  double getLatitude(){return latitude;}

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void displayInfo(){
        System.out.println(locName+":("+longitude+","+latitude+")");
    }
}

