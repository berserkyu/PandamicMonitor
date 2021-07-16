package grp.pandemicmonitor.dataClasses.Address;

//为方便前后端沟通而将地址信息封装成类
public class Address {
    AddressPrefix addressPrefix;

    String address;

    public Address(String prefix, String address) {
        System.out.println("Address constructor");
        this.addressPrefix = new AddressPrefix(prefix);
        this.address = address;
    }
    public String getArea() {
        return addressPrefix.getArea();
    }
    public String getProvince() {
        return addressPrefix.getProvince();
    }

    public String getCity() {
        return addressPrefix.getCity();
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullAddress(){
        return getProvince()+","+getCity()+","+getArea()+","+address;
    }

}
