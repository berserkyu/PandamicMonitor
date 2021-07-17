package grp.pandemicmonitor.dataClasses.Address;

//为方便前后端沟通而将地址信息封装成类
public class Address {
    String province;
    String city;
    String area;
    String address;

    public Address(String province, String city, String area, String address) {
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
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
}
