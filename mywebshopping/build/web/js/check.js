function validate()
{
	var ex1 = /^([0-9]*){1,5}$/;
	var sp1 = document.getElementById("un");
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
		sp1.innerHTML="";
	}
	
	////////////////////////////////////////////////////
	
	var ex2 = /^([A-Za-z0-9@!#$^&_ ]*){6,10}$/;
	var sp2 = document.getElementById("pass");
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


