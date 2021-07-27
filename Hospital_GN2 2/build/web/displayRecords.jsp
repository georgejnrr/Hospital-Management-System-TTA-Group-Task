<%@page import="com.hospital.model.MyConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Patient Records</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body><center>
    <div id="main_container">
  <div class="header">
    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
    <div class="right_header">
        <div class="top_menu"> <a href="login.jsp" class="login">login</a><a href="logout" class="sign_up">Logout</a> </div>
      <div id="menu">
        <ul>
          <li><a class="current" href="index.jsp">Home</a></li>
          <li><a href="bookings.jsp" target="f1">Bookings</a></li>
         <!-- <li><a href="treatment.jsp">Treatments</a></li> -->
          <li><a href="displayRecords.jsp">Treatments</a></li>
        </ul>
      </div>
    </div>
  </div>
    </div>
        <center>
            <h1 style="color: black">Patient Records</h1>
        
        
        <!--Database code to display all records-->
        <%
        try
        {
        Connection con = MyConnection.connect();//get connection
        Statement stmt = con.createStatement();//create statement
        String qry = "select * from record";//select query to display all records
        ResultSet rs = stmt.executeQuery(qry);//execute query
        %>
        <!Database code to display all records in a table from ResultSet in browser>
        <table  border="1" padding="10">
        <%    
                //get one by one record from ResultSet
                while(rs.next())
                {
        %>            
                    <tr>
                        <td><%= rs.getInt(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getInt(3)%></td>
                        <td><%= rs.getString(4)%></td>
                        <td><%= rs.getString(5)%></td>
                        <td><%= rs.getString(6)%></td>
                        <td><%= rs.getString(7)%></td>
                        <td><%= rs.getString(8)%></td>
                    </tr>
        <%
                    
                }//while ends
        %>
            </table>       
        <%        
            }//try ends
            catch(Exception ex)
            {
                System.out.println("Display error :"+ex);
            }//catch ends
        
        %>
       
    </center>   
    </body>
</html>
