<%-- 
    Document   : add
    Created on : Oct 10, 2017, 4:10:15 PM
    Author     : carterneilsen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a new Student </title>
        <link rel="StyleSheet" type="text/css" href="HW5css.css" />
    </head>
    <body>
        <h1>Add a New Student</h1>
        <div class="addform">
        <form name="AddForm" action="Add" method="get">
            
            <br>
             <label> Major: </label>
             <input type="text" name="MAJOR" value="" />
             <br>
            <label> Hometown: </label>
            <input type="text" name="HOMETOWN" value="" />
            
            <br>
            <label> Age: </label>
            <input type="text" name="Age" value="" />
           
            <br>
            <label> Favorite Bar: </label>
            <input type="text" name="FAVBAR" value="" />
            <br>
            </div>
        <div class="buttons">
            <input type="reset" id="clear" value="Clear"/>
            <input type="submit" name="submit" value="Submit" />
        </div>
        </form>
            
        
        
        
    </body>
</html>
