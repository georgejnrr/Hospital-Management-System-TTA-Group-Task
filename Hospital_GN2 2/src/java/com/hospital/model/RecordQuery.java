
package com.hospital.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RecordQuery {
    //1. Insert Patient record
    public static int insert(Record r)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            //qry1 insert patient booking details into record db
            String qry1 = "insert into record(treat,name,phone,dob,problem,docName,medecine,test,bookingDate) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry1);//query getting pre-compile
            //setting column values in student table
            
            stmt.setInt(1,r.getTreat());
            stmt.setString(2,r.getName());
            stmt.setInt(3,r.getPhone());
            stmt.setString(4, r.getDob());
            stmt.setString(5, r.getProblem());
            stmt.setString(6, r.getDocName());
            stmt.setString(7, r.getMedicine());
            stmt.setString(8, r.getTest());
            stmt.setString(9, r.getBookingDate());
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends
}
