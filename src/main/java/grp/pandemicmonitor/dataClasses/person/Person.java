package grp.pandemicmonitor.dataClasses.person;

import java.time.LocalDate;
//import java.util.Date;
import java.sql.Date;

//所有人员的信息
public class Person {
    //人员基本信息
    //身份证号,邮箱,全名,电话号码,性别,密码
    private String idNo,mail,fullName,phoneNo,gender,password;
    //地址
    //Address address;
    String address;
    //生日
    private Date birthday;
    //年龄
    private int age;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String idNo, String mail, String fullName, String phoneNo,/*Address address*/String address, String gender, Date birthday) {
        this.idNo = idNo;
        this.mail = mail;
        this.fullName = fullName;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.birthday = birthday;
        //this.address = address;
        this.address = address;
        this.age = LocalDate.now().getYear() - birthday.getYear()-1900;
    }
    public Person() {
        this.idNo = "";
        this.mail = "";
        this.fullName = "";
        this.phoneNo = "";
        this.address = "";
        // this.address = new Address("","","","");
        this.gender = "";
        this.birthday = new Date(2000-1-1);
        this.age = 0;
        this.password = "";
    }

    public void displayInfo(){
        System.out.println("("+idNo+","+fullName+","+gender+","+birthday.toString()+","+age+","+phoneNo+","+mail+","+address+")");
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        System.out.println("set fullname");
        this.fullName = fullName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    /*
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        System.out.println("set bday : "+birthday.toString());
        this.birthday = birthday;
        age = this.age = LocalDate.now().getYear() - birthday.getYear()-1900;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
