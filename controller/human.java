/*
Couior Managment System : Solution
AWON ABBAS 
0075-BSCS-2019 (Section C)

Description: this is a parent class of sender and the reciver of the couior, this class contain detail of sender or reciver
used classes :  
*/
package controller;

import java.io.Serializable;

public abstract class human implements Serializable {
    private String name, fatherName, CNIC, address, phoneNumber, gender, age;

    public human(String name, String fatherName, String CNIC, String address, String phoneNumber, String gender, String age) {
        this.name = name;
        this.fatherName = fatherName;
        this.CNIC = CNIC;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", CNIC='" + CNIC + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
