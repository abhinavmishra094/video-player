package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class log1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("  ");

           
           String s1,s2,s3,s4,s5,s6;
           s1=request.getParameter("un");
           s2=request.getParameter("pass");
           Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebshopping","root","root");
           //String s="Select un,password from login where uname=? and password=?"; 
           PreparedStatement ps=con.prepareStatement("Select * from login where uname=? and password=?");
           ps.setString(1,s1);
           ps.setString(2, s2);
            ResultSet rs=ps.executeQuery();
            //s3=rs.getString("First_Name");
            //s4=rs.getString("Last_Name");
            //s5=rs.getString("Email");
            //s6=rs.getString("Address");
            int mb=rs.getInt("mb");
           if(rs.next())
           {
               session.setAttribute("a", s1);
               session.setAttribute("b", s2);
              // session.setAttribute("c", s3);
               //session.setAttribute("d", s4);
               //session.setAttribute("e", s5);
                //session.setAttribute("e", s6);
               //session.setAttribute("f", mb);
           response.sendRedirect("index.jsp");
          // respons
           }
           else
           {
            response.sendRedirect("login.jsp?msg=invalid user id or password");
           }
        
      out.write('\n');
      out.write(' ');
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
