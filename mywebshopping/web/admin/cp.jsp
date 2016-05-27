<%@page import="java.sql.*;import my.Connect" %>
  <%
           Connection con=Connect.getconnection();
           String s1,s2,s3;
           String opass=null;
            String sec=(String)session.getAttribute("admin");
           s3=request.getParameter("opass");
           s1=request.getParameter("npass");
           s2=request.getParameter("cpass");
           try{
           
           if(s1.equals(s2))
           {
           PreparedStatement ps= con.prepareStatement("update admin set pass=? where admin='"+sec+"' and pass=? ");
           ps.setString(1,s1);
           ps.setString(2, s3);
           int i=ps.executeUpdate();
           if(i>0)
           {
           response.sendRedirect("admin.jsp?msg=pass successfully changed...");
           }
           else
           {
           response.sendRedirect("change_password.jsp?msg=old pass incorrect...");
           }    
           
           }
           
           else
            response.sendRedirect("change_password.jsp?msg=confirm pass not match...");   
           
           
           }
           catch(Exception pp)
           {
               out.print(pp.getMessage());
           }
      
      %>     