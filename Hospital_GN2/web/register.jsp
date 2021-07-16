<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
      <div id="main_container">
  <div class="header">
    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
    <div class="right_header">
        <div class="top_menu"> <a href="login.jsp" class="login">login</a> <a href="register.jsp" class="sign_up">Register</a><a href="index.jsp" class="index">Home</a> </div>
<!--      <div id="menu">
        <ul>
            <li><a class="current" href="index.jsp">Home</a></li>
          <li><a href="patientAccess.jsp" target="=f1">Patient Access</a></li>
          <li><a href="doctorAccess.jsp" target="f1">Doctor Access</a></li>
          <li><a href="bookings.jsp" target="f1">Bookings</a></li>
        </ul>
      </div>-->
    </div>
  </div>
        <form name="registrationForm" onsubmit="return validateForm()" action="register" method="post">
    <h1>Register</h1>
<br/><br/><br/>
    <div class="row">
        <label>Select User</label>
        <div class="form-inline">
            <label><input type="radio" name="user" value="doctor"> Doctor</label>
            <label><input type="radio" name="user" value="patient"> Patient</label>
            <br/><br/>
             <input id="s1" type="submit" value="Submit">

        </div>
        <div class="error" id="genderErr"></div>
    </div>
</form>
    </body>
</html>