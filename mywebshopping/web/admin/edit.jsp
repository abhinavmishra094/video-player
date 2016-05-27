
<%@page import="java.sql.*;import my.Connect" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>

        <div class="container">
		<div class="account">
        <h4 style="font-size:30px; alignment-adjust: middle ">Edit Products</h4>
        <form action="ed1.jsp" method="post">
        <table style="width: 70%;height: 500px;" >
            <%
                 
            Connection con=Connect.getconnection();
           try
           {  
            String s0=request.getParameter("id");
            
           PreparedStatement ps= con.prepareStatement("Select * from product where product_id='"+s0+"'  ");
            ResultSet rs=ps.executeQuery();
           
           
            
            if(rs.next())
            {
                 session.setAttribute("pid", rs.getString(8));
            %>
            <tr><td>Product Id</td><td><%=rs.getString(8)%> </td></tr>
             <tr><td>Product Name</td><td><input type="text" name="p_n" value="<%=rs.getString(1)%>"></td></tr>
            <tr><td>Category</td><td><input type="text" name="cat" value="<%=rs.getString(2)%>"></td></tr>
            <tr><td>Price</td><td><input type="text" name="price"value="<%=rs.getString(3)%>"></td></tr>
            <tr><td>Description</td><td><input type="text" name="desc"value="<%=rs.getString(4)%>"></td></tr>
            <tr><td>Image</td><td><input type="file" name="img" value="Browse"value="<%=rs.getString(5)%>"/></td></tr>
            <tr><td>Date</td><td><input type="date" name="date"value="<%=rs.getString(6)%>"></td></tr>
            <tr><td>Brand</td><td><input type="text" name="bnd"value="<%=rs.getString(7)%>"></td></tr>
            <tr><td></td><td><input type="submit" value="Add"></td></tr>
            <%
            }
            }
           catch(Exception e)
           {
            out.println(e.getMessage());
           }
            
            
            %>
        </table>
            
            
        </form>
                </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
