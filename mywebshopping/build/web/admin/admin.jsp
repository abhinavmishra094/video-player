<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
    </head>
    <body>
        
        
        <jsp:include page="header.jsp"/>
        <div class="container">
	<div class="account">
        <h1 style="font-size:30px; ">Administrator Page </h1>
          <table style="width: 100%; height: 500px;">
            
            
              <tr><td><a href="add.jsp" style="font-size:20px ">Add Products</a></td></tr>
              <tr><td><a href="vp.jsp" style="font-size:20px" >View Products</a></td></tr>
              <tr><td><a href="dp.jsp"style="font-size:20px " >Delete Products</a></tr>
               <tr><td></td><td></td></tr>
                
                
           
            
        </table>
        </div>
        </div>
       
        <jsp:include page="footer.jsp"/>
        
        
    </body>
</html>
