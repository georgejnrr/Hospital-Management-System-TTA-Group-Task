
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html> <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>

    <body>

<!--        <div id="main_container">

  <div class="header">

    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>

    <div class="right_header">

      <div class="top_menu"> <a href="index.jsp" class="index">Home</a><a href="login.jsp" class="login">login</a> <a href="register.jsp" class="sign_up">Register</a> </div>



    </div>

  </div>

        <form name="loginForm" action="login" method="post">

    <h1>Login Form</h1>

<br/><br/><br/>

    <div class="row">

        <label>Select User</label>

        <div class="form-inline">

            <label><input type="radio" name="user" value="doctor"> Doctor</label>

            <label><input type="radio" name="user" value="patient"> Patient</label>

            <br/><br/>

             <input id="s1" type="submit" value="Login">

         <input id="s1" type="reset" value="Clear">

        </div>

        <div class="error" id="genderErr"></div>

    </div> </form>

    </body>-->

    <div class="main-block">
     <form name="loginForm" action="login" method="post">
        
      <h1>Login</h1>
      <fieldset>
        <legend>
          <h3>Login Form</h3>
          
        </legend>

        <div class="form-inner">
            <h1>Select User</h1>

                
           
             
               Doctor: <input type="radio" value="doctor" name="user" required/>
               Patient: <input type="radio" value="patient" name="user" required/> 
               <button type="submit" value="Login">Login</button>
             
            </div
          
      </fieldset>
    </form>
    </div>
      </body>
</html>

