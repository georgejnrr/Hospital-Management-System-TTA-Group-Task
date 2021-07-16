
package com.hospital.model;

/**
 *
 * @author GEORGE JNR
 */
public class Patient {
 
    int phone;
    String name;
    String address;
    String dob;
    String password;
    // default constructor
 
    public Patient() {
    }
    
      // parametrized constructor

    public Patient(int phone, String name, String address, String dob, String password) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.password = password;
    }
    
    // setter and getter constructor

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
