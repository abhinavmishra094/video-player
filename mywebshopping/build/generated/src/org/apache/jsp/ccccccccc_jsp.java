package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ccccccccc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("\tvar ex1 = /^([0-9]*){1,5}$/;\n");
      out.write("\tvar sp1 = document.getElementById(\"id\");\n");
      out.write("\tif(document.login.uid.value==\"\")\n");
      out.write("\t{\n");
      out.write("\t\tsp1.innerHTML = \"User Id is required.\";\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse if(ex1.test(document.login.uid.value)==false)\n");
      out.write("\t{\n");
      out.write("\t\tsp1.innerHTML = \"User Id contains only digits(Max 5)\";\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\tsp1.innerHTML=\"Ok\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t////////////////////////////////////////////////////\n");
      out.write("\t\n");
      out.write("\tvar ex2 = /^([A-Za-z0-9@!#$^&_ ]*){6,10}$/;\n");
      out.write("\tvar sp2 = document.getElementById(\"upass\");\n");
      out.write("\tif(document.login.pass.value==\"\")\n");
      out.write("\t{\n");
      out.write("\t\tsp2.innerHTML = \"Password is required.\";\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse if(ex2.test(document.login.pass.value)==false)\n");
      out.write("\t{\n");
      out.write("\t\tsp2.innerHTML = \"Password contains alphanumeric value(Min 6, Max 10)\";\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\tsp2.innerHTML=\"Ok\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("return false;\t\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"login\" action=\"footer.jsp\" method=\"post\" onsubmit=\"return validate();\">\n");
      out.write("<table cellspacing=\"8px\" cellpadding=\"5px\">\n");
      out.write("<tr><td>User ID</td><td><input type=\"text\" name=\"uid\" maxlength=\"5\" /><span id=\"id\"></span></td></tr>\n");
      out.write("<tr><td>Password</td><td><input type=\"password\" name=\"pass\" /><span id=\"upass\"></span></td></tr>\n");
      out.write("<tr><td></td><td><input type=\"submit\" name=\"sub\" value=\"Login\" /> <a href=\"signup.php\"><input type=\"button\" value=\"Sign Up\" /></a></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
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
