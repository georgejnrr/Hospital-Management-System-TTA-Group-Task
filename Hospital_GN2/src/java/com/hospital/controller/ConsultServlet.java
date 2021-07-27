/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controller;

import com.hospital.model.DoctorQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GEORGE JNR
 */
public class ConsultServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try{
       int phone;
       String medicine;
       String test;
          
       phone = Integer.parseInt(request.getParameter("phone")); 
      medicine = request.getParameter("medicine");
        test= request.getParameter("test");
             System.out.println(phone);
             System.out.println(medicine);
             System.out.println(test);
        int r = DoctorQuery.update(phone,medicine, test);
             
        
          if(r==1)
            {
                out.print("Patient record updated succesfully");
                request.getRequestDispatcher("doctorAccess.jsp").include(request, response);
            } // ends if 
            
            else
            {
              out.print("Something wrong... update unsuccessful");  
                request.getRequestDispatcher("doctorAccess.jsp").include(request, response);
            } //ends else
        }
         catch(Exception ex)
         {
             System.out.println("Consult error :"+ex);
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
