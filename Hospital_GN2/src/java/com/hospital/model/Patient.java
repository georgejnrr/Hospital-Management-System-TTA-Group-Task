/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.model;

/**
 *
 * @author joanlaine
 */
public class Patient {
    
    int phone;
    String name;
    String address;
    String dob;
    String password;
    String problem;        
    
    
//create default constructor
       public Patient() {
    }

  //create parameterised constructor

    public Patient(int phone, String name, String address, String dob, String password, String problem) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.password = password;
        this.problem = problem;
    }

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

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }



   
    
}
