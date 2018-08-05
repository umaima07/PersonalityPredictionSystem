<%-- 
    Document   : RegForm
    Created on : Jul 15, 2018, 6:06:13 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" type="text/css" href="reg.css">
        
    </head>
    <body>
        <div class="container">
        <form action="regFormAction.jsp">
            <label>Enter your first name: </label>
            <input type="text" name="fname" value="" />
            <br>
            <br>
            <label>Enter your last name: </label>
            <input type="text" name="lname" value="" />
            <br>
            <br>
            <label>Select birth date: </label>
            <select name="day">
            <% int j=1;
            int Day[]=new int[31];
            for(int i=0;i<31;i++)
            {
                Day[i]=j;
            j++; %>
            <option value="<%=Day[i]%>"><%=Day[i]%></option>
            <% }
            
            %>
                    
               
            </select>
            <select name="month">
                <option value="00">Month</option>
                <option  value="01">January</option>
                <option value="02">February</option>
                <option value="03">March</option>
                <option value="04">April</option>
                <option value="05">May</option>
                <option value="06">June</option>
                <option value="07">July</option>
                <option value="08">August</option>
                <option value="09">September</option>
                <option value="10">October</option>
                <option value="11">November</option>
                <option value="12">December</option>
            </select>
            <select name="year">
                <option>Year</option>
                <option value="1995">1995</option>
                <option  value="1996">1996</option>
                <option  value="1997">1997</option>
                <option  value="1998">1998</option>
                <option  value="1999">1999</option>
            </select>
            <br>
            <br>
            <label>Select gender: </label>
            <input type="radio" name="mr" value="1" checked="checked" />Male
            <input type="radio" name="mr" value="2" />Female
            <br>
            <br>
            <label>Enter SSC percentage: </label>
            <input type="text" name="ssc" value="" />
            <br>
            <br>
            <label>Enter HSC percentage or average SGPA(diploma): </label>
            <input type="text" name="hsc" value="" />
            <br>
            <br>
            <label>Enter your email-id: </label>
            <input type="text" name="email" value="" />
            <br>
            <br>
            <label>Enter contact number: </label>
            <input type="text" name="num" value="" />
            <br>
            <br>
            <label>Create password: </label>
            <input type="password" name="passwd" value="" />
            <br>
            <br>
            <label>Select a security question: </label>
            <select name="security">
                <option>Name of your primary school?</option>
                <br>
                <option>City you were born?</option>
                <br>
                <option>First book you read?</option>
                <br>
                <option>Best friend's middle name?</option>
                <br>
                <option>First pet's name?</option>
            </select>
            <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" name="ans" value="" />
            <br>
            <br>
            <label>Select degree: </label>
            <select name="degree">
                <option>BSc CS</option>
                <option>BSc IT</option>
                <option>BE CS</option>
                <option>BE IT</option>
            </select>
            <br>
            <br>
            <label>Select your key skills: </label>
            
            <input type="checkbox" name="skills" value="SQL/MySQL" />SQL/MySQL
            <input type="checkbox" name="skills" value="CoreJava" />Core Java
            <input type="checkbox" name="skills" value="Adv.Java" />Adv. Java
            <input type="checkbox" name="skills" value="C#" />C#
            <input type="checkbox" name="skills" value="PHP" />PHP
            <input type="checkbox" name="skills" value="HTML/CSS" />HTML/CSS
            <input type="checkbox" name="skills" value="Python" />Python
            <input type="checkbox" name="skills" value="C/C++" />C/C++
            <input type="checkbox" name="skills" value="JavaScript" />JavaScript          
            <br>
            <br>
            <label>Enter your College name: </label>
            <input type="text" name="clgName" value="" />
            <br>
            <br> 
            &emsp;&emsp;&emsp;&emsp;&emsp;
            <input type="submit" value="Save Details" />
        </form>
        </div>
        </body>
</html>
