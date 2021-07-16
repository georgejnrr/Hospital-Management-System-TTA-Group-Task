<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>dlog</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
     <center>
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
                    <td><input id="s1" type="submit" value="Submit" /></td>

                    <td><input id="s1" type="reset" value="Clear" /></td>
                </tr>
        </table>
</form>
  </div>  
         
         
    </center>
    </body>
</html>