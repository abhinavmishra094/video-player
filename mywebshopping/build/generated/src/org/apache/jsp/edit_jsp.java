package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("  \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form method=\"get\" action=\"edit1.jsp\">\n");
      out.write("        <table cellspacing=\"5\" >\n");
      out.write("            <tr><td>First Name</td><td><input name=\"fn\" value=\"");
String s1,s2,s3,s4,s5=(String)session.getAttribute("c");out.println(s5); 
      out.write("\" ></td></tr>    \n");
      out.write("            <tr><td>Last Name</td><td><input name=\"ln\" value=\"");
s1=(String)session.getAttribute("d");out.println(s1); 
      out.write("\" ></td></tr>\n");
      out.write("            <tr><td>Email</td><td><input name=\"em\" value=\"");
s2=(String)session.getAttribute("e");out.println(s2); 
      out.write("\" ></td></tr>\n");
      out.write("            <tr><td>Address</td><td><input name=\"add\" value=\"");
s3=(String)session.getAttribute("f");out.println(s3); 
      out.write("\" ></td></tr>\n");
      out.write("            <tr><td></td><td><input name=\"mb\" value=\"");
int mb=Integer.parseInt((String)session.getAttribute("mb"));out.println(mb); 
      out.write("\" ></td></tr>\n");
      out.write("            <tr><td></td><td><input type=\"submit\" value=\"Update\"></td></tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
