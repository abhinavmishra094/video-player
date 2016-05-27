
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <jsp:include page="header.jsp" ></jsp:include>
        
        <div class="container">
		<div class="account">
        <h4 style="font-size:30px; alignment-adjust: middle ">Change Password</h4>
        <form action="cp.jsp" method="post">
        <table style="width: 50%; height: 500px;">
              <tr><td style="font-size:20px">Old Password</td><td><input type="password" name="opass" ></td></tr>
                
            <tr><td style="font-size:20px">New Password</td><td><input type="password" name="npass" ></td></tr>
           <tr> <td style="font-size:20px">Confirm Password </td><td><input type="password" name="cpass" ></td></tr>
           <tr><td></td><td><input type="submit" value="Update Password" > </td></tr>
            <tr><td></td></tr>
            
        </table>
        </form>
                </div>
        </div>
        
        
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
