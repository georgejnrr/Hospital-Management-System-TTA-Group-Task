/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controller;

import com.hospital.model.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GEORGE JNR
 */
public class BookingServlet extends HttpServlet {
   String name;
   int phone;
   String dob;
   String problem;
   String docName;
   String medicine;
   String test;
   String bookingDate;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             name = request.getParameter("name");
            phone = Integer.parseInt(request.getParameter("phone"));
           dob = request.getParameter("dob");
            problem = request.getParameter("problem");
            docName = request.getParameter("docName");
               medicine = request.getParameter("medicine");
                  test= request.getParameter("test");
            bookingDate = request.getParameter("bookingDate");
         
         {
                Connection con = MyConnection.connect();
                Statement stmt = con.createStatement();
                int insertRecord = stmt.executeUpdate("insert into record(name, phone, dob, problem, docName, medicine, test,bookingDate) values('"+name+"','"+phone+"','"+dob+"','"+problem+"','"+docName+"','"+medicine+"','"+test+"','"+bookingDate+"')");
                request.setAttribute("phone", phone);
                request.getRequestDispatcher("bookings.jsp").forward(request, response);
            }
        } 
        catch(Exception ex) {
               System.out.println("Booking error :"+ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
