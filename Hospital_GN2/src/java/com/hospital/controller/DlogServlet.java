package com.hospital.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javax.servlet.http.HttpSession;

/**
 *
 * @author joanlaine
 */

public class DlogServlet extends HttpServlet {

    String docid, password;
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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */   

        //get request parameters
        docid = request.getParameter("docid");
        password = request.getParameter("password");
        
           Connection con = MyConnection.connect(); 
            
            //4. Write Sql
            Statement stmt = con.createStatement();
            
             
            String qry1 = "select * from doctor where docid='"+docid+"' and password='"+password+"'";
            ResultSet rs1 = stmt.executeQuery(qry1);
            if(rs1.next())
            {
                String docName = rs1.getString(2);
                
              out.print("Hi "+docName+ "Welcome, to  Medical Clinic Management System.");
                System.out.println(docName);
              
              //HttpSession se = request.getSession();
              request.setAttribute("docName" , docName);
              
              request.getRequestDispatcher("doctorAccess.jsp").forward(request, response);
          }
          else{
              out.print("Oops.. your username or password is incorrect.");
              
              request.getRequestDispatcher("dlog.jsp").include(request, response);
          }
            
        
       
           
        }//tryends
           
       catch(Exception ex) {
            out.close();
        }//finally ends
    }//class ends
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
