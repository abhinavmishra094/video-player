package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add Products</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t<div class=\"account\">\n");
      out.write("        <h4 style=\"font-size:30px; alignment-adjust: middle \">Add Products</h4>\n");
      out.write("        <form method=\"get\" action=\"add2.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("        <table style=\"width: 50%; height: 500px;\">\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("           <tr><td>Product Id</td><td><input type=\"text\" name=\"pid\"></td></tr>\n");
      out.write("            <tr><td>Product Name</td><td><input type=\"text\" name=\"p_n\"></td></tr>\n");
      out.write("            <tr><td>Category</td><td><input type=\"text\" name=\"cat\"></td></tr>\n");
      out.write("            <tr><td>Price</td><td><input type=\"text\" name=\"price\"></td></tr>\n");
      out.write("            <tr><td>Description</td><td><input type=\"text\" name=\"desc\"></td></tr>\n");
      out.write("            <tr><td>Image</td><td><input type=\"file\" name=\"img\" value=\"Browse\" /></td></tr>\n");
      out.write("            <tr><td>Date</td><td><input type=\"date\"  name=\"date\"></td></tr>\n");
      out.write("            <tr><td>Brand</td><td><input type=\"text\" name=\"bnd\"></td></tr>\n");
      out.write("            <tr><td></td><td><input type=\"submit\" value=\"Add\"></td></tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
