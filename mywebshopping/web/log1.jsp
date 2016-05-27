<%@page import="java.sql.*;import my.Connect"  %>
  <%
           
           String s1,s2,s3,s4,s5,s6;
           s1=request.getParameter("un");
           s2=request.getParameter("pass");
           Connection con=Connect.getconnection();
            //String s="Select un,password from login where uname=? and password=?"; 
           PreparedStatement ps=con.prepareStatement("Select * from login where uname=? and password=?");
           ps.setString(1,s1);
           ps.setString(2, s2);
            ResultSet rs=ps.executeQuery();

           if(rs.next())
           {
               session.setAttribute("a", rs.getString(6));
              
           response.sendRedirect("index.jsp");
       
           }
           else
           {
            response.sendRedirect("login.jsp?msg=invalid user id or password");
           }
        %>
 