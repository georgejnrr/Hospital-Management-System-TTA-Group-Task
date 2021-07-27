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
public class Record {
      int treat;
    int phone;     
    String name;
   String dob;
   String problem;
   String docName;
   String medicine;
   String test;
   String bookingDate;

    //create default constructor

    public Record() {
       
        
    }
    //create parameterized constructor 

    public Record(int treat, int phone, String name, String dob, String problem, String docName, String medicine, String test, String bookingDate) {
        this.treat = treat;
        this.phone = phone;
        this.name = name;
        this.dob = dob;
        this.problem = problem;
        this.docName = docName;
        this.medicine = medicine;
        this.test = test;
        this.bookingDate = bookingDate;
    }

      
    //create getter setter

    public int getTreat() {
        return treat;
    }

    public void setTreat(int treat) {
        this.treat = treat;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

}