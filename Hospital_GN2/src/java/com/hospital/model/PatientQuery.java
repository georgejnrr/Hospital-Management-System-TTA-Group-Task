
package com.hospital.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PatientQuery {
    //1. Insert Patient record
    public static int insert(Patient p)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            String qry1 = "insert into patient(name,phone,address,dob,password) values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry1);//query getting pre-compile
            //setting column values in student table
            
            stmt.setString(1,p.getName());
            stmt.setInt(2,p.getPhone());
            stmt.setString(3,p.getAddress());
            stmt.setString(4, p.getDob());
            stmt.setString(5, p.getPassword());
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends
}
