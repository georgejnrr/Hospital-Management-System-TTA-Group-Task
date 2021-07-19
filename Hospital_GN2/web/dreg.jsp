
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>preg</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>      

    <body>
<!--
    

        <div class="form">

        <form action="dreg" method="post">

            <h1> Doctor Registration Form</h1>

            <table border="1">

                <tr>

                    <td>Name:<input type="text" name="docName" value="" /> </td>

                    <td>ID: <input type="text" name="docid" value="" /></td>

                    <td>Address: <input type="text" name="address" value="" /></td>

                    <td>Degree: <input type="text" name="degree" value="" /></td>

                </tr>

                <tr>

                    <td>Phone Number: <input type="text" name="phone" value="" /></td>

                    <td>Speciality: <input type="text" name="subject" value="" /></td>

                    <td>Password: <input type="password" name="password" value="" /></td>

                    <td>Confirm Password: <input type="password" name="cpassword" value="" /></td>

                </tr>

                <tr>

                    <td><input id="s1" type="submit" value="Submit" /></td>

                    <td><input id="s1" type="reset" value="Clear" /></td>

                </tr>

        </table>
</form>-->

<div class="form">
        <form action="dreg" method="post">
<fieldset>
            <legend>
              <h3>Doctor Registration</h3>
              
            </legend>
    
            <div class="form-inner">
                <h1>Doctor Registration</h1>
               
                Doctor ID: <input type="text" name="docid" value="" placeholder="Enter Doctor's ID">
                Name: <input type="text" name="docName" value="" placeholder="Enter Doctor's Name">
                Phone Number: <input type="text" name="phone" value="" placeholder="Enter phone number">
                Address: <input type="text" name="address" value="" placeholder="Enter Address">
               Degree: <input type="text" name="degree" value="" placeholder="Enter Qualification">
               Speciality: <input type="text" name="subject" value="" placeholder="Enter Specialisation">
               Password: <input type="password" name="password" placeholder="Enter Password">
               Confirm Password: <input type="password" name="cpassword" placeholder="Confirm Password">
               <button type="submit" value="Register">Register</button>
              </div>
        
      </fieldset>
        </form>

  </div>   
        

    </body>

</html>

