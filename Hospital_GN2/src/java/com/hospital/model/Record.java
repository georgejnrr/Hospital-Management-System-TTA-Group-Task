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
    int pid;
    String name;
    String phone;
    String dob;
    String problem;
    String docname;
    int docid;
    String test;
    String treat;

    //create default constructor
    public Record() {
    }

    //create parameterized constructor
    public Record(int pid, String name, String phone, String dob, String problem, String docname, int docid, String test, String treat) {
        this.pid = pid;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.problem = problem;
        this.docname = docname;
        this.docid = docid;
        this.test = test;
        this.treat = treat;
    }
    
    //create getter setter

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }
    
    
    
}
