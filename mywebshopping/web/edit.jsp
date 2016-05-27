

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="my.Connect;import java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>  
        
        <br>
        <br>
        <form method="get" action="edit1.jsp">
            <%
                String user=(String)session.getAttribute("a");
                      Connection con=Connect.getconnection();
                      PreparedStatement ps=con.prepareStatement("select * from login where uname=?");
                      ps.setString(1, user);
                      
                      ResultSet rs=ps.executeQuery();
                      if(rs.next())
                      {
                      
                      %>
                      <div class="container">
		<div class="account">
        <table style="font-size:25px; height: 400px; width: 600px">
            <tr><td>First Name</td><td><input name="fn" value="<%=rs.getString(1)%>" ></td></tr>    
            <tr><td>Last Name</td><td><input name="ln" value="<%=rs.getString(2)%>" ></td></tr>
            <tr><td>Email</td><td><input name="em" value="<%=rs.getString(3)%>" ></td></tr>
            <tr><td>Address</td><td><input name="add" value="<%=rs.getString(4)%>" ></td></tr>
            <tr><td>Mobile Number</td><td><input name="mb" value="<%=rs.getString(5)%>" ></td></tr>
            <tr><td></td><td><input type="submit" value="Update"></td></tr>
        </table>
            
            <%
                      }
                      %>
                </div>
                      </div>
        </form>
        
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
