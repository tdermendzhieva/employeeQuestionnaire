<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="user.*"%>
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>JPA Guestbook Web Application Tutorial</title>
    </head>
 
    <body>
    <h3>INDEX JSP</h3>
        <form method="POST" action="user.html">
            lastname: <input type="text" name="lastname" />
            firstname: <input type="text" name="firstname" />
            username: <input type="text" name="username" />
            password: <input type="text" name="password" />
            <input type="submit" value="Add" />
        </form>
 
        <iframe src="http://www.objectdb.com/pw.html?spring-eclipse"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>