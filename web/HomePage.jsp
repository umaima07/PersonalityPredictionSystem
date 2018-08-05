<%-- 
    Document   : HomePage
    Created on : Jul 27, 2018, 9:20:47 PM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="hp.css">
        <title>Home Page</title>
    </head>
    <body>
                <br><br><br>                <br><br><br>       
        <div class="container">
            
            <form name="form" action="loginCheck.jsp" method="POST" onsubmit="return validLogin()">
                <label>Username: </label>
                <input type="text" name="txtusername" required="Please enter username" placeholder="Enter email-id" />
                                <br><br><br>
                <label>Password: </label>
                <input type="password" name="txtpassword" required="Please enter password" placeholder="Enter password here" />
                                <br>
                                <br>
                                <tbreak>
                                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                <a href="#" style="font-size: 16px; font-family: courier;">Forgot Password?</a>
                                 <br><br>
                                 <button class="btn" type="submit" name="login" /> Login <tbreak><tbreak>
                                </button>
                                 <button class="btn" type="submit" name="register" onclick="redirect();" />New? Register
                                </button>
                                 <script>
                                 function redirect()
                                        {
                                            window.location="http://localhost:8080/WebApplication2/RegForm.jsp";
                                        }
                                        
                                        </script>
            </form>
        </div>
       
    </body>
</html>
