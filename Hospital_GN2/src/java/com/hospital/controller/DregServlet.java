/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controller;

import com.hospital.model.Doctor;
import com.hospital.model.DoctorQuery;
     
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joanlaine
 */
public class DregServlet extends HttpServlet {
    int docid;
    String docName;
    int phone;
    String address;
    String degree;
    String subject;
    String password; 

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            /* TODO output your page here. You may use following sample code. */
         PrintWriter out = response.getWriter();
         docid = Integer.parseInt(request.getParameter("docid"));
         docName = request.getParameter("docName");
         phone = Integer.parseInt(request.getParameter("phone"));
         address = request.getParameter("address");
         degree = request.getParameter("degree");
         subject = request.getParameter("subject");
         password = request.getParameter("password");
        String cpass = request.getParameter("cpassword");
         
        if(password.equals(cpass)){
            
        
        //create Doctor object
        Doctor d = new Doctor(docid,docName,phone, address, degree, subject, password);
        //create Doctor record in DB
       int r = DoctorQuery.insert(d);
       
       if(r==1)
       {
           out.print("<h1>You have successfully registered</h1>");
           request.getRequestDispatcher("doctorAccess.jsp").include(request,response);
       }
       else{
           out.print("<h1>Oops. Did you miss a field?</h1>");
           request.getRequestDispatcher("dreg.jsp").include(request, response);

    }}//else ends
        else{
           out.print("<h1>Oops!..Password don't match</h1>");
           request.getRequestDispatcher("dreg.jsp").include(request, response);  
        }
        
    }//try ends
        
        catch(Exception ex){
            System.out.println("Servlet Error :"+ex);
        }//catch ends
    }//process ends
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}