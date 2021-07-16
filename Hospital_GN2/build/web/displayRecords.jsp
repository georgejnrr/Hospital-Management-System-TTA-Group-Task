<%-- 
    Document   : displayRecords
    Created on : 8 Jul 2021, 09:24:08
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Display Records</title>

                <link rel="stylesheet" type="text/css" href="style.css" media="screen" />

    </head>

    <body>

         <div id="main_container">

  <div class="header">

    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>

    <div class="right_header">

      <div class="top_menu"> <a href="login.jsp" class="login">login</a> <a href="welcome.jsp" class="sign_up">Register</a> <a href="welcome.jsp" class="sign_up">Sign Out</a></div>

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

    <center>

        <h3><b>DISPLAY PATIENT RECORD TABLE</b></h3>

        <form>

            <table border="5" width="" cellspacing="5" cellpadding="5">

                    <tr>

                        <td>PID</td>

                        <td>Patient Name</td>

                         <td>Date</td>

                        <td>Problem</td>

                            <td>Treatment</td>

                    </tr>

                    <tr>

                        <td></td>

                        <td></td>

                         <td></td>

                        <td></td>

                          <td></td>

                    </tr>

                    <tr>

                        <td></td>

                        <td></td>

                         <td></td>

                        <td></td>

                          <td></td>

                    </tr>

                    <tr>

                        <td></td>

                        <td></td>

                         <td></td>

                        <td></td>

                          <td></td>

                    </tr>

                    <tr>

                        <td></td>

                        <td></td>

                         <td></td>

                        <td></td>

                          <td></td>

                    </tr>

                    <tr>

                        <td></td>

                        <td></td>

                         <td></td>

                        <td></td>

                          <td></td>

                    </tr>

            </table>         </form>

    </center>

    </body>

    <div id="footer">

    <div class="copyright"> <img src="images/footer_logo.gif" alt="" /> </div>

    <div class="center_footer">&copy; Medical Clinic 2008. All Rights Reserved</div>

  </div>

</div>

</html>
