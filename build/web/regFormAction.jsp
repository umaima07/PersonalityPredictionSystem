<%-- 
    Document   : regFormAction
    Created on : Jul 31, 2018, 10:50:36 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%          
            String fn=request.getParameter("fname");
            String ln=request.getParameter("lname");
            String a=request.getParameter("day");          
            String b=request.getParameter("month");          
            String c=request.getParameter("year");          
            String g=request.getParameter("mr");                      
            String eid=request.getParameter("email");
            String cont=request.getParameter("num");
            String pass=request.getParameter("passwd");
            String sec=request.getParameter("ans");          
            String college=request.getParameter("clgName");
            String dateformat =  c+"-"+b+"-"+a;
           try{ 
               Class.forName("com.mysql.jdbc.Driver");
               Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");                                                              
         String sql="insert into user_personal(fname,lname,contact,clg,emailid,pwd,dob,gender,security) values(?,?,?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,fn);
                ps.setString(2,ln);        
                ps.setString(3,cont);        
                ps.setString(4,college);        
                ps.setString(5,eid);        
                ps.setString(6,pass);        
                ps.setString(7,dateformat);        
                ps.setString(8,g);        
                ps.setString(9,sec);        
                ps.executeUpdate();
                ps.close();
               }
catch(Exception e)
{
    out.println(e);
}
         %>
        
    </body>
</html>
