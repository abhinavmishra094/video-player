

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;import my.Connect" %>
  <%
           Connection con=Connect.getconnection();
           %>
       
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Products</title>
    </head>
    <body>
         <jsp:include page="header.jsp" ></jsp:include>
<%
    String sec=(String)session.getAttribute("admin");
if(sec==null)
{
 
    response.sendRedirect("login.jsp");
}

%>
        <div class="container">
		<div class="account">
                    <h4 style="font-size:30px; alignment-adjust: middle ">View Products &ensp; &ensp;
                        <a href="add1.jsp" style="color: #ff0000; text-decoration-line: none; ">Add New Product</a>
        </h4>
        <table style="width: 70%;" border="2px">
         <tr>
            <td>Product Id</td>
            <td>Product Name</td>
            <td>Category</td>
            <td colspan="2">Price</td>
            
            </tr>
            <%

             PreparedStatement ps= con.prepareStatement("select * from product");
             
             ResultSet rs=ps.executeQuery();
             while(rs.next())
                 {
            %>
            
            <tr>
                <td><%=rs.getString(8)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><a href="edit.jsp?id=<%=rs.getString(8)%>" style="color: #ff0000; text-decoration-line: none; font: bold">Edit</a></td>
            </tr>
            
            
            <%
                 }
            %>
            
        </table>
            <table style="width:30%">
                
                <tr><td></td></tr>  
                
                
                
                <tr><td></td></tr>
                <tr><td></td></tr>
            </table>
       
                </div>
        </div>
        
        
        
        
        <jsp:include page="footer.jsp"></jsp:include>
        
    </body>
</html>
