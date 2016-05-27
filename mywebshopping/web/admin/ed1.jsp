<%@page import="java.sql.*;import my.Connect" %>
  <%         
           String s1,s2,s3,s4,s5,s6,s7;
           String s8 =(String)session.getAttribute("pid");
           out.print(s8);
            s1=request.getParameter("date");
           s2=request.getParameter("p_n");    
           s3=request.getParameter("cat");
           int p=Integer.parseInt(request.getParameter("price"));
           s5=request.getParameter("desc");
          s6=request.getParameter("img");
          s7=request.getParameter("bnd");
          int pid=Integer.parseInt(s8);
           Connection con=Connect.getconnection();
           try
           {
           PreparedStatement ps= con.prepareStatement("update product set p_n=?,category=?,price=?,desc=?,image=?,date=?,brand=? where product_id=? ");
           ps.setString(1, s2);
           ps.setString(2, s3);
           ps.setInt(3, p);
           ps.setString(4, s5);
           ps.setString(5, s6);
           ps.setString(6, s1);
           ps.setString(7, s7);
           ps.setInt(8,pid );
            int i= ps.executeUpdate();
          if(i>0)
           {
           response.sendRedirect("vp1.jsp?msg=pass successfully changed...");
           }
           else
           {
           response.sendRedirect("add2.jsp");
           } 
           }
           catch(Exception po)
           {
               out.print(po.getMessage());
           }
  %> 