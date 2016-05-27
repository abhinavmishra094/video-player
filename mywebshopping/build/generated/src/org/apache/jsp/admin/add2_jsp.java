package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import java.sql.*;import my.Connect;;
import java.io.*;;
import java.util.*;;

public final class add2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  ");
     
      try
      {
  
           Connection con=Connect.getconnection();
           String s1,s2,s3,s4,s5,s6,s7;
          /* String contentType = request.getContentType();
if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {

DataInputStream in = new DataInputStream(request.getInputStream());
int formDataLength = request.getContentLength();

 byte dataBytes[]= new byte[formDataLength];
int byteRead = 0;
int totalBytesRead = 0;
while (totalBytesRead < formDataLength) {
byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
totalBytesRead += byteRead;
}
*/

      
           String s8 =request.getParameter("pid");
            s1=request.getParameter("date");
           s2=request.getParameter("p_n");    
           s3=request.getParameter("cat");
           int p=Integer.parseInt(request.getParameter("price"));
           s5=request.getParameter("desc");
          s6=request.getParameter("img");
          s7=request.getParameter("bnd");
            PreparedStatement ps= con.prepareStatement("Insert into product values (?,?,?,?,?,?,?,?)");
            
            ps.setString(1,s2 );
           ps.setString(2,s3 );
           ps.setInt(3,p );
           ps.setString(4,s5 );
           ps.setString(6,s1 );
           ps.setString(5,s6);
           ps.setString(7,s7 );
           ps.setInt(8,Integer.parseInt(s8));
            int i=ps.executeUpdate();
           if(i>0 )
         {
         response.sendRedirect("admin.jsp");
         }
}

catch(Exception e)
      {
        out.println(e.getMessage());
      }

      out.write('\n');
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
