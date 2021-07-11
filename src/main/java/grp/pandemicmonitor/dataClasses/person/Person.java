package grp.pandemicmonitor.dataClasses.person;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String idNo,mail,fullName,phoneNo,address,gender;
    private Date birthday;
    private int age;

    public Person(String idNo, String mail, String fullName, String phoneNo, String address, String gender, Date birthday) {
        this.idNo = idNo;
        this.mail = mail;
        this.fullName = fullName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.age = LocalDate.now().getYear() - birthday.getYear()+1900;
    }
    public Person() {
        this.idNo = "";
        this.mail = "";
        this.fullName = "";
        this.phoneNo = "";
        this.address = "";
        this.gender = "";
        this.birthday = new Date(2000-1-1);
        this.age = 0;
    }

    public void displayInfo(){
        System.out.println("("+idNo+","+fullName+","+gender+","+birthday+","+age+","+phoneNo+","+mail+","+address+")");
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
        this.fullName = fullName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

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
        this.birthday = birthday;
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
