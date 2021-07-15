package grp.pandemicmonitor.dataClasses.Address;

public class AddressPrefix {
    //省,市,区,区内地址
    String province;
    String city;
    String area;

    public AddressPrefix(){
        System.out.println("AddressPrefix default constr");
        this.province="";
        this.city="";
        this.area="";
    }

    public AddressPrefix(String prefix){
        System.out.println("AddressPrefix param constr");
        prefix.replaceAll("\\s","");
        String[] strings = prefix.split("/");
        province = strings[0];
        city = strings[1];
        area = strings[2];
    }

    public String getFullPrefix(){
        return province+","+city+","+area+",";
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
}
