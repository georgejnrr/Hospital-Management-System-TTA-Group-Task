
<%@page import="java.sql.*"%>
<%@page import="com.hospital.model.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <title>Tookings</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
                <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
        <div id="main_container">
            <div class="header">
                <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
                <div class="right_header">
                    <div class="top_menu"> <a href="login.jsp" class="login">login</a><a href="logout" class="sign_up">Logout</a> </div>
                    <div id="menu">
                        <ul>
                            <li><a class="current" href="index.jsp">Home</a></li>
                            <li><a href="displayRecords.jsp" width="20px">Patient History</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div id="middle_box">
                <div class="middle_box_content"><img src="images/banner_content.jpg" alt="" /></div>
            </div>
            <div class="table">
                <div class="form">
                            <center>
        <form action="booking" method="post">   
      <%
               String name =request.getParameter("name");
      int phone = Integer.parseInt(request.getAttribute("phone").toString());
 
      String dob =request.getParameter("dob");
      String problem =request.getParameter("problem");
      String docName =request.getParameter("docName");
      String bookingDate = request.getParameter("bookingDate");
      Connection con = MyConnection.connect();
                Statement stmt = con.createStatement();
               
           int insertRecord = stmt.executeUpdate("insert into record(name, phone, dob, problem, docName,bookingDate) values('"+name+"','"+phone+"','"+dob+"','"+problem+"','"+docName+"','"+bookingDate+"')");
       // String name;
        //int phone;
        //String dob;
       // String problem;
       // String docName;
       // String bookingDate;       

                ResultSet rs = stmt.executeQuery("select * from record where phone="+phone);
                %>
                <table border="1">
                    
                <%
                if(rs.next())
                {
                    name=rs.getString("name");
                    phone=rs.getInt("phone");
                   dob = rs.getString("dob");
                   problem= rs.getString("problem");
                   docName=rs.getString("docName");
                   bookingDate=rs.getString("bookingDate");
                   
  %>
                    
                                          <tr>
                                            <th width="5px">No</th>
                                            <th width="30px">Phone</th>
                                            <th>Name</th>
                                            <th width="10%">DOB</th>
                                            <th>Problem</th>
                                            <th>Doctor</th>
                                            <th>Booking Date</th>
                                        </tr
  
  
  
  <tr>
                        <td><%= name%></td>
                        <td><%= phone%></td>
                        <td><%= dob%></td>
                        <td><%= problem%></td>
                        <td><%= docName%></td>
                        <td><%= bookingDate%></td>
                   </tr>
<%
                           }
                
      %>
                                    </form>
                                </table><!-- table ends  -->
                                  
                                </div><!-- div table ends -->
                            
                            </center>
                                    </div><!-- div form ends  -->
                        </div><!--div main container ends-->
    </body>
</html>