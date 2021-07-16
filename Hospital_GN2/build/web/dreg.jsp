
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

<title>dreg</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> <link rel="stylesheet" type="text/css" href="style.css" media="screen" />

<!--[if IE 6]>

<link rel="stylesheet" type="text/css" href="iecss.css" />

<![endif]-->       

    <body>

    

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
</form>

  </div>   
        

    </body>

</html>

