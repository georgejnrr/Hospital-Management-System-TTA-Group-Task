/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author joanlaine
 */
public class DoctorQuery {
    //1. Insert Doctor record
    public static int insert(Doctor d)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            String qry = "insert into doctor(docid,docName,phone,address,degree,subject,password) values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compile
            //setting column values in student table
            stmt.setInt(1, d.getDocid());
            stmt.setString(2,d.getDocName());
            stmt.setInt(3,d.getPhone());
            stmt.setString(4,d.getAddress());
            stmt.setString(5, d.getDegree());
            stmt.setString(6, d.getSubject());
            stmt.setString(7, d.getPassword());
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends

    //2.Validate existing user
   
    
////2. update -> int
//    public static int update(int sid , int up_score)
//    {
//        int row_update = 0;
//        try
//        {
//            Connection con = MyConnection.connect();//get connection
//            Statement stmt = con.createStatement();
//            
//            String qry = "update doctor set score="+up_score+" where sid="+sid;;
//            
//            row_update = stmt.executeUpdate(qry);
//        }
//        catch(Exception ex)
//        {
//            System.out.println("Update Error :"+ex);
//        }
//        
//        return row_update;
//    }
//    
//    //3. delete -> int
//    public static int delete(int sid)
//    {
//        int row_delete = 0;
//        try
//        {
//            Connection con = MyConnection.connect();//get connection
//            Statement stmt = con.createStatement();
//            
//            String qry = "delete from student where sid="+sid;
//            
//            row_delete = stmt.executeUpdate(qry);
//        }
//        catch(Exception ex)
//        {
//            System.out.println("Delete Error :"+ex);
//        }
//        
//        return row_delete;
//    }    
//    

    public static int update(int phone , String medicine, String test) {
        
    int uprow=0;
    try{
        
        //update record table[medicine and test] for given phone 
        Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update record set medicine="+medicine+", test="+test+" where phone="+phone;;
            
            uprow = stmt.executeUpdate(qry);
        
    }
    catch(Exception ex)
    {
        System.out.println("update error :"+ex);
    }
    return uprow;
    
    }
}//class ends
