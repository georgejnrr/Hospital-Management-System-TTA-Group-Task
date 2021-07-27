<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>plog</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>
    <body>
    <div class="main-block">
    <form action="plog" method="post">
      <h1>Patient Access</h1>
      <fieldset>
        <legend>
          <h3>Patient Login</h3>
          
        </legend>

        <div class="form-inner">
            <h1>Patient Login</h1>
            Phone Number: <input type="text" name="phone" value="" placeholder="Login with phone number">
            Password: <input type="password" name="password" value ="" placeholder="Enter Password">
            
            <button type="submit" value="Submit">Submit</button>
          </div>
      </fieldset>
    </form>
    </div>
    </body>
</html>