<%-- 
    Document   : bookings
    Created on : 8 Jul 2021, 11:26:51
    Author     : joanlaine
--%>

<%@page import="java.sql.*"%>
<%@page import="com.hospital.model.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>bookings</title>
       <!-- <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />-->
                <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
         <div id="main_container">
  <div class="header">
    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
    <div class="right_header">
        <div class="top_menu"> <a href="login.jsp" class="login">login</a><a href="logout" class="sign_up">Logout</a> </div>
         </div>
             
    </div>
         </div>
             
      <%
      int phone = Integer.parseInt(request.getAttribute("phone").toString());
      Connection con = MyConnection.connect();
                Statement stmt = con.createStatement();
                //int insertRecord = stmt.executeUpdate("insert into record(phone, dob, problem, docName,bookingDate) values("+phone+",'"+dob+"','"+problem+"','"+docName+"','"+bookingDate+"')");
        String dob,problem,docName,bookingDate,pname;       

                ResultSet rs = stmt.executeQuery("select * from record where phone="+phone);
                %>
                <table border="1">
                <%
                if(rs.next())
                {
                    pname=rs.getString("name");
                    phone = rs.getInt("phone");
                   dob = rs.getString("dob");
                   problem= rs.getString("problem");
                   docName=rs.getString("docName");
                   bookingDate=rs.getString("bookingDate");
                   
  %>
                    <tr>
                        <td><%= pname%></td>
                        <td><%= phone%></td>
                        <td><%= dob%></td>
                        <td><%= problem%></td>
                        <td><%= docName%></td>
                        <td><%= bookingDate%></td>
                   </tr>
<%
                           }
                
      %>
                </table>
    </body>
</html>
