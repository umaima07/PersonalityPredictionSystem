<%-- 
    Document   : category1
    Created on : Jul 30, 2018, 9:24:13 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mathematics</h1>
        <form name="form1" action="category2.jsp">
            <label>Question 1:</label>
            <input type="text" name="txtquestion" required="Please enter question!" />
            <label>A.</label>
            <input type="text" name="op1" value="" />
            <label>B.</label>
            <input type="text" name="op2" value="" />
            <label>C.</label>
            <input type="text" name="op3" value="" />
            <label>D.</label>
            <input type="text" name="op4" value="" />
        </form>
    </body>
</html>
