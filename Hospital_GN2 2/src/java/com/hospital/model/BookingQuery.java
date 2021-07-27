
package com.hospital.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BookingQuery {
    //1. Insert Patient record

   
    public static int insert(Booking b)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            // Qry 1 -> Patient Booking
            String qry1 = "insert into patient(name,phone,dob,problem) values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry1);//query getting pre-compile
            //setting column values in student table
            
            stmt.setString(1,b.getName());
            stmt.setInt(2,b.getPhone());
        
            stmt.setString(3, b.getDob());
            stmt.setString(4, b.getProblem());
           
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends
    
    //update starts
    public static int update(int name, int phone, String dob, String problem)
    {
        int row_update = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update patient set name="+name+" dob="+dob+" problem="+problem+" where phone="+phone;;
            
            row_update = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
}
