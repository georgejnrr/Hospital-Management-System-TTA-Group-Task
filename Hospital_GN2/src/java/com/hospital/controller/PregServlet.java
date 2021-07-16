
package com.hospital.controller;


import com.hospital.model.Patient;
import com.hospital.model.PatientQuery;

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
public class PregServlet extends HttpServlet {

     int phone;
    String name;
    String address;
    String dob;
    String password;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
        try {
            /* TODO output your page here. You may use following sample code. */
             PrintWriter out = response.getWriter();
         phone = Integer.parseInt(request.getParameter("phone"));
         name = request.getParameter("name");
         address = request.getParameter("address");
         dob= request.getParameter("dob");
         password = request.getParameter("password");
        String cpass = request.getParameter("cpassword");
         
        if(password.equals(cpass)){
        //create Patient object
          Patient p= new Patient(phone,name,address,dob,password);
        //create Doctor record in DB
       int r = PatientQuery.insert(p);
       
       if(r==1)
       {
           out.print("You have successfully registered");
           request.getRequestDispatcher("plog.jsp").include(request,response);
       }
       else{
           out.print("Registration unsuccessful. All fields must be completed.");
           request.getRequestDispatcher("preg.jsp").include(request, response);

    }}//else ends
        else{
           out.print("Password did not match");
           request.getRequestDispatcher("preg.jsp").include(request, response);  
        }
        
    }//try ends
         catch(Exception ex){
            System.out.println("Servlet Error :"+ex);
        }//catch ends
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
