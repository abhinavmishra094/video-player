package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;import my.Connect;

public final class vp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("  ");

           Connection con=Connect.getconnection();
           
      out.write("\n");
      out.write("       \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Products</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');

    String sec=(String)session.getAttribute("admin");
if(sec==null)
{
 
    response.sendRedirect("login.jsp");
}


      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t<div class=\"account\">\n");
      out.write("        <h4 style=\"font-size:30px; alignment-adjust: middle \">View Products</h4>\n");
      out.write("        <table style=\"width: 70%;\" border=\"2px\">\n");
      out.write("         <tr>\n");
      out.write("            <td>Product Id</td>\n");
      out.write("            <td>Product Name</td>\n");
      out.write("            <td>Category</td>\n");
      out.write("            <td>Price</td>\n");
      out.write("            </tr>\n");
      out.write("            ");


             PreparedStatement ps= con.prepareStatement("select * from product");
             
             ResultSet rs=ps.executeQuery();
             while(rs.next())
                 {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("            <td><img src=\"");
      out.print(rs.getBlob(6));
      out.write("\" alt=\"");
      out.print(rs.getString(1));
      out.write("\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

                 }
            
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("            <table style=\"width:30%\">\n");
      out.write("                \n");
      out.write("                <tr><td></td></tr>  \n");
      out.write("                \n");
      out.write("                <tr><td style=\"height: 100px;alignment-adjust: central\"><a href=\"edit.jsp\" style=\"color: #000; text-decoration-line: none;font: bold;font-size: 250% \">Edit</a></td><td style=\"height: 100px;alignment-adjust: central\"><a href=\"add1.jsp\" style=\"color: #000; text-decoration-line: none;font: bold;font-size: 250% \">Add</a></td></tr>\n");
      out.write("                \n");
      out.write("                <tr><td></td></tr>\n");
      out.write("                <tr><td></td></tr>\n");
      out.write("            </table>\n");
      out.write("       \n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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
