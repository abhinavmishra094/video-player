<%@page import="java.sql.*;import my.Connect" %>
  <%
           Connection con=Connect.getconnection();
           String s1=request.getParameter("pid") ;
           PreparedStatement ps=con.prepareStatement("Delete from product where product_id=? ");
           ps.setString(1,s1 );
           int i=ps.executeUpdate();
           if(i>0)
           {
            response.sendRedirect("admin.jsp");
           }
  
  
  
  
  
  
  
  %>