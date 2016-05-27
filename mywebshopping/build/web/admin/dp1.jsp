

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Products</title>
    </head>
    <body>
         <jsp:include page="header.jsp" ></jsp:include>
        
        <div class="container">
		<div class="account">
        <h4 style="font-size:30px; alignment-adjust: middle ">Delete Products</h4>
        <table style="width: 50%; height: 500px;">
                    
            
            <tr><td>Enter Product Id </td><td><input type="text" name="pid"></td></tr>
            <tr><td></td><td><a href="dp2.jsp"><input type="button" value="Delete" ></a></td></tr>
            <tr><td></td></tr>
            <tr><td></td></tr>
            
        </table>
       
                </div>
        </div>
        
        
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
