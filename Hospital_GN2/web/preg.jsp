
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>preg</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>
    <body>
<!--       <center>
        <div class="form">
        <form action="preg" method="post">

            <h1> Patient Registration Form</h1>

            <table border="1">

                <tr>
                    <td>Name:<input type="text" name="name" value="" /> </td>
                    <td>Date of Birth: <input type="text" name="dob" value="" /></td>
                </tr>
                <tr>
                    <td>Address: <input type="text" name="address" value="" /></td>
                    <td>Phone <input type="text" name="phone" value="" /></td>
                </tr>
                <tr>

            <td>Password: <input type="password" name="password" value="" /></td>
                    <td>Confirm Password: <input type="password" name="cpassword" value="" /></td>
                </tr>

                <br/>
                <tr>
                    <td><input id="s1" type="submit" value="Register" /></td>

                    <td><input id="s1" type="reset" value="Clear" /></td>
                </tr>



        </table>
</form>
  </div>  
    </center>   -->
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