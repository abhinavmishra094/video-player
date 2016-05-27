<%-- 
    Document   : ccccccccc
    Created on : Oct 10, 2015, 12:47:53 PM
    Author     : Prabhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
function validate()
{
	var ex1 = /^([0-9]*){1,5}$/;
	var sp1 = document.getElementById("id");
	if(document.login.uid.value=="")
	{
		sp1.innerHTML = "User Id is required.";
		return false;
	}
	else if(ex1.test(document.login.uid.value)==false)
	{
		sp1.innerHTML = "User Id contains only digits(Max 5)";
		return false;
	}
	else
	{
		sp1.innerHTML="Ok";
	}
	
	////////////////////////////////////////////////////
	
	var ex2 = /^([A-Za-z0-9@!#$^&_ ]*){6,10}$/;
	var sp2 = document.getElementById("upass");
	if(document.login.pass.value=="")
	{
		sp2.innerHTML = "Password is required.";
		return false;
	}
	else if(ex2.test(document.login.pass.value)==false)
	{
		sp2.innerHTML = "Password contains alphanumeric value(Min 6, Max 10)";
		return false;
	}
	else
	{
		sp2.innerHTML="Ok";
		return true;
	}
	
return false;	
}
</script>
    </head>
    <body>
        <form name="login" action="footer.jsp" method="post" onsubmit="return validate();">
<table cellspacing="8px" cellpadding="5px">
<tr><td>User ID</td><td><input type="text" name="uid" maxlength="5" /><span id="id"></span></td></tr>
<tr><td>Password</td><td><input type="password" name="pass" /><span id="upass"></span></td></tr>
<tr><td></td><td><input type="submit" name="sub" value="Login" /> <a href="signup.php"><input type="button" value="Sign Up" /></a></td></tr>
</table>
</form>
    </body>
</html>
