<%-- 
    Document   : bookings
    Created on : 8 Jul 2021, 11:26:51
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>bookings</title>
        <link rel="stylesheet" type="text/css" href="formstyle.css" media="screen" />
    </head>
    <body>
         <div class="form">
        <form action="preg" method="post">
       <fieldset>
        <legend>
          <h3>Patient Bookings</h3>
          
        </legend>

        <div class="form-inner">
            <h1>Appointment Details</h1>
            Patient Name: <input type="text" name="name" value="">
            Phone Number: <input type="text" name="phone" value="">
            Date of Birth<input type="text" name="dob" value="">
            Problem: <textarea placeholder="Problem..." rows="5" name="problem"></textarea>
    
            <div>
                <label>Select Doctor*</label>  
                <select>
                  <option value=""></option>
                  <option value=""></option>
                  <option value=""></option>
                  <option value=""></option>
                  <option value=""></option>
                  <option value=""></option>
                 <option value=""></option>
                </select>
              </div>

            
            <button type="submit" href="/">Submit</button>
          </div>
       </fieldset>
        </form>
         </div>
    </body>
</html>
