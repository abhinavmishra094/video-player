
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <% try
    {
        String s1,s2,s11,s22,ss,x,y,z;
           s1=request.getParameter("fn");
           s2=request.getParameter("ln");
           s11=request.getParameter("em");
           s22=request.getParameter("add");
           ss=request.getParameter("mb");
           x=request.getParameter("un");
           y=request.getParameter("pass");
           Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebshopping","root","root");
       
           PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?,?,?,?,?)"); 
        
           ps.setString(1,s1 );
        
           ps.setString(2, s2);
        
           ps.setString(3, s11);
           ps.setString(4,s22);
           
           ps.setInt(5, Integer.parseInt(ss));
            ps.setString(6,x);
             ps.setString(7,y);
           int i=ps.executeUpdate();    
           if(i>0)
           {
            response.sendRedirect("login.jsp?msg=Registerd Successfully");
           }}
    catch(Exception e)
    {
        
    }
        
     %>
    <body>
        
    </body>
</html>
