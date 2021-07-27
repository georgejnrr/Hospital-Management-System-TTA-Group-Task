<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>dlog</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>
    <body>
<!--     <center>
        <div class="form">
        <form action="dlogin" method="post">

            <h1> Doctor Login Form</h1>

            <table border="1">

                <tr>
                    <td>Doctor ID:<input type="text" name="docid" value="" />

                </tr>
                <tr>
                    <td>Password: <input type="password" name="password" value="" /></td>

                </tr>


                <tr>
                    <td><input id="s1" type="submit" value="Login" /></td>

                    <td><input id="s1" type="reset" value="Clear" /></td>
                </tr>
        </table>
</form>
  </div>  
         
  </center>-->

<div class="main-block">
    <form action="dlogin" method="post">
      <h1>Doctor Access</h1>
      <fieldset>
        <legend>
          <h3>Doctor Login</h3>
          
        </legend>

        <div class="form-inner">
            <h1>Doctor Login</h1>
            Doctor ID: <input type="text" name="docid" value="" placeholder="Login with Doctor ID">
            Password: <input type="password" name="password" value="" placeholder="Enter Password">
            
            <button type="submit" value="Submit">Submit</button>
          </div>
      </fieldset>
    </form>
</div>
    </body>
</html>