

<%@page import="java.sql.*" %>

<%
    
 String s1,s2,s3,s4,s5;
s1=request.getParameter("fn");
s2=request.getParameter("ln");
s3=request.getParameter("em");
s4=request.getParameter("add");
s5=(String)session.getAttribute("a");
String mb=request.getParameter("mb");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebshopping","root","root");
PreparedStatement ps= con.prepareStatement("update login set first_name=?,last_name=?,email=?,address=?,mb=? where uname=?");
ps.setString(1,s1 );
ps.setString(2,s2 );
ps.setString(3,s3 );
ps.setString(4,s4 );
ps.setInt(5,Integer.parseInt(mb));
ps.setString(6,s5 );
int i=ps.executeUpdate();
if(i>0)
{
 response.sendRedirect("index.jsp");
}
}
catch(Exception e)
{
System.out.print(e.getMessage());
}
%>