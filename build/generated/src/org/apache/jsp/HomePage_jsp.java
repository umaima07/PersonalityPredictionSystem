package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"hp.css\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <br><br><br>                <br><br><br>       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <form name=\"form\" action=\"loginCheck.jsp\" method=\"POST\" onsubmit=\"return validLogin()\">\n");
      out.write("                <label>Username: </label>\n");
      out.write("                <input type=\"text\" name=\"txtusername\" required=\"Please enter username\" placeholder=\"Enter email-id\" />\n");
      out.write("                                <br><br><br>\n");
      out.write("                <label>Password: </label>\n");
      out.write("                <input type=\"password\" name=\"txtpassword\" required=\"Please enter password\" placeholder=\"Enter password here\" />\n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                                <tbreak>\n");
      out.write("                                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("                                <a href=\"#\" style=\"font-size: 16px; font-family: courier;\">Forgot Password?</a>\n");
      out.write("                                 <br><br>\n");
      out.write("                                 <button class=\"btn\" type=\"submit\" name=\"login\" /> Login <tbreak><tbreak>\n");
      out.write("                                </button>\n");
      out.write("                                 <button class=\"btn\" type=\"submit\" name=\"register\" onclick=\"redirect();\" />New? Register\n");
      out.write("                                </button>\n");
      out.write("                                 <script>\n");
      out.write("                                 function redirect()\n");
      out.write("                                        {\n");
      out.write("                                            window.location=\"http://localhost:8080/WebApplication2/RegForm.jsp\";\n");
      out.write("                                        }\n");
      out.write("                                        \n");
      out.write("                                        </script>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
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
