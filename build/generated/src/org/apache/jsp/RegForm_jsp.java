package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"reg.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form action=\"regFormAction.jsp\">\n");
      out.write("            <label>Enter your first name: </label>\n");
      out.write("            <input type=\"text\" name=\"fname\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Enter your last name: </label>\n");
      out.write("            <input type=\"text\" name=\"lname\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Select birth date: </label>\n");
      out.write("            <select name=\"day\">\n");
      out.write("            ");
 int j=1;
            int Day[]=new int[31];
            for(int i=0;i<31;i++)
            {
                Day[i]=j;
            j++; 
      out.write("\n");
      out.write("            <option value=\"");
      out.print(Day[i]);
      out.write('"');
      out.write('>');
      out.print(Day[i]);
      out.write("</option>\n");
      out.write("            ");
 }
            
            
      out.write("\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("            </select>\n");
      out.write("            <select name=\"month\">\n");
      out.write("                <option value=\"00\">Month</option>\n");
      out.write("                <option  value=\"01\">January</option>\n");
      out.write("                <option value=\"02\">February</option>\n");
      out.write("                <option value=\"03\">March</option>\n");
      out.write("                <option value=\"04\">April</option>\n");
      out.write("                <option value=\"05\">May</option>\n");
      out.write("                <option value=\"06\">June</option>\n");
      out.write("                <option value=\"07\">July</option>\n");
      out.write("                <option value=\"08\">August</option>\n");
      out.write("                <option value=\"09\">September</option>\n");
      out.write("                <option value=\"10\">October</option>\n");
      out.write("                <option value=\"11\">November</option>\n");
      out.write("                <option value=\"12\">December</option>\n");
      out.write("            </select>\n");
      out.write("            <select name=\"year\">\n");
      out.write("                <option>Year</option>\n");
      out.write("                <option value=\"1995\">1995</option>\n");
      out.write("                <option  value=\"1996\">1996</option>\n");
      out.write("                <option  value=\"1997\">1997</option>\n");
      out.write("                <option  value=\"1998\">1998</option>\n");
      out.write("                <option  value=\"1999\">1999</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Select gender: </label>\n");
      out.write("            <input type=\"radio\" name=\"mr\" value=\"1\" checked=\"checked\" />Male\n");
      out.write("            <input type=\"radio\" name=\"mr\" value=\"2\" />Female\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Enter SSC percentage: </label>\n");
      out.write("            <input type=\"text\" name=\"ssc\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Enter HSC percentage or average SGPA(diploma): </label>\n");
      out.write("            <input type=\"text\" name=\"hsc\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Enter your email-id: </label>\n");
      out.write("            <input type=\"text\" name=\"email\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Enter contact number: </label>\n");
      out.write("            <input type=\"text\" name=\"num\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Create password: </label>\n");
      out.write("            <input type=\"password\" name=\"passwd\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Select a security question: </label>\n");
      out.write("            <select name=\"security\">\n");
      out.write("                <option>Name of your primary school?</option>\n");
      out.write("                <br>\n");
      out.write("                <option>City you were born?</option>\n");
      out.write("                <br>\n");
      out.write("                <option>First book you read?</option>\n");
      out.write("                <br>\n");
      out.write("                <option>Best friend's middle name?</option>\n");
      out.write("                <br>\n");
      out.write("                <option>First pet's name?</option>\n");
      out.write("            </select>\n");
      out.write("            <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"ans\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Select degree: </label>\n");
      out.write("            <select name=\"degree\">\n");
      out.write("                <option>BSc CS</option>\n");
      out.write("                <option>BSc IT</option>\n");
      out.write("                <option>BE CS</option>\n");
      out.write("                <option>BE IT</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Select your key skills: </label>\n");
      out.write("            \n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"SQL/MySQL\" />SQL/MySQL\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"CoreJava\" />Core Java\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"Adv.Java\" />Adv. Java\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"C#\" />C#\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"PHP\" />PHP\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"HTML/CSS\" />HTML/CSS\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"Python\" />Python\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"C/C++\" />C/C++\n");
      out.write("            <input type=\"checkbox\" name=\"skills\" value=\"JavaScript\" />JavaScript          \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label>Enter your College name: </label>\n");
      out.write("            <input type=\"text\" name=\"clgName\" value=\"\" />\n");
      out.write("            <br>\n");
      out.write("            <br> \n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <input type=\"submit\" value=\"Save Details\" />\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
