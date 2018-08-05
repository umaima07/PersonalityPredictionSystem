<%-- 
    Document   : loginCheck
    Created on : Jul 27, 2018, 2:06:35 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import=" tycs.connectionClass,java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id=request.getParameter("txtusername");
            String psd=request.getParameter("txtpassword");
            out.print(id);
            out.print(psd);
            %>
          
            <%
                try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","newrootpassword");                                              
                PreparedStatement ps=con.prepareStatement("select * from user_personal where emailid=? and pwd=?");
                ps.setString(1, id);
                ps.setString(2, psd);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                response.sendRedirect("loginAction.jsp");
                }
                else
                {
                response.sendRedirect("HomePage.jsp");                
                }
                   }
                catch(Exception e)
                {
                out.print(e);
                }
 

 %> 
    </body>
</html>
