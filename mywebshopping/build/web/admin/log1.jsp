<%@page import="java.sql.*;import my.Connect" %>
  <%
           Connection con=Connect.getconnection();
           String s1,s2;
           s1=request.getParameter("un");
           s2=request.getParameter("pass");
           PreparedStatement ps=con.prepareStatement("Select admin,pass from admin where admin=? and pass=?");
           ps.setString(1,s1);
           ps.setString(2, s2);
           ResultSet rs=ps.executeQuery();
            
           if(rs.next())
           {
           session.setAttribute("admin", s1);
              
           response.sendRedirect("admin.jsp");
          // respons
           }
           else
           {
            response.sendRedirect("login.jsp?msg=invalid user id or password");
           }
        %>
 