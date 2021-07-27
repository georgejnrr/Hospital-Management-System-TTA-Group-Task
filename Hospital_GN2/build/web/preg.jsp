
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>preg</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>
    <body>

 <div class="form">
        <form action="preg" method="post">
<fieldset>
            <legend>
              <h3>Patient Registration</h3>
              
            </legend>
    
            <div class="form-inner">
                <h1>Registration</h1>
                Patient Name: <input type="text" name="name" placeholder="Enter Name">
                Phone Number: <input type="text" name="phone" placeholder="Enter phone number">
                Address: <input type="text" name="address" placeholder="Enter Address">
                <div class=form-inner>
   
                    <label for="bdate">Birth Date <span>*</span></label>
                    <input id="bdate" type="date" name="dob" />
                    <i class="fas fa-calendar-alt"></i>
                    </div>
                Password: <input type="password" name="password" placeholder="Enter Password">
                Confirm Password: <input type="password" name="cpassword" placeholder="Confirm Password">
                <button type="submit" value="Register">Register</button>
              </div>
        
      </fieldset>
        </form>
 </div>
    </body>
</html>