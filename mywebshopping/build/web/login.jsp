
<!DOCTYPE html>
<html>
<head>
<title>E Shopping Websites: Made by Abhinav Mishra</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
<script type="text/javascript">
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
		sp1.innerHTML="Ok";
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
		sp2.innerHTML="";
		return true;
	}
	
return false;	
}
</script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">		
					<ul>
						<li ><a class="lock"  href="login.jsp"  >Login</a></li>
						<li><a class="lock" href="register.jsp"  >Register</a></li>
						<li>
</li>

					</ul>
					<div class="cart box_1">
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo.png" alt=""></a>	
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="index.jsp">Home</a></li>	
				      <li><a class="color1" href="#">Electronics</a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.jsp">External Hardisk</a></li>
										<li><a href="products.jsp">Internal Hardisk</a></li>
										<li><a href="products.jsp">Ram</a></li>
										<li><a href="products.jsp">Monitors</a></li>
										<li><a href="products.jsp">Micro Processors</a></li>
										<li><a href="products.jsp">PC Cabinet </a></li>
										<li><a href="products.jsp">Mobiles</a></li>
										<li><a href="products.jsp">PC Power Supply</a></li>
										<li><a href="products.jsp">Cables</a></li>
										<li><a href="products.jsp">Consoles</a></li>
										<li><a href="products.jsp">Games</a></li>
									</ul>	
								</div>							
							</div>
                                                        <%--<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.jsp">Shirts</a></li>
										<li><a href="products.jsp">Shoes, Boots & Trainers</a></li>
										<li><a href="products.jsp">Shorts</a></li>
										<li><a href="products.jsp">Suits & Blazers</a></li>
										<li><a href="products.jsp">Sunglasses</a></li>
										<li><a href="products.jsp">Sweatpants</a></li>
										<li><a href="products.jsp">Swimwear</a></li>
										<li><a href="products.jsp">Trousers & Chinos</a></li>
										<li><a href="products.jsp">T-Shirts</a></li>
										<li><a href="products.jsp">Underwear & Socks</a></li>
										<li><a href="products.jsp">Vests</a></li>
									</ul>	
								</div>							
							</div>--%>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="products.jsp">HP</a></li>
										<li><a href="products.jsp">Accer</a></li>
										<li><a href="products.jsp">Lenovo</a></li>
										<li><a href="products.jsp">Aus</a></li>
										<li><a href="products.jsp">Gigabyte</a></li>
										<li><a href="products.jsp">Razer</a></li>
										<li><a href="products.jsp">Apple</a></li>
										<li><a href="products.jsp">Smasung</a></li>
										<li><a href="products.jsp">Sony</a></li>
										<li><a href="products.jsp">Toshiba</a></li>
										<li><a href="products.jsp">Dell</a></li>
									</ul>	
								</div>												
							</div>
						  </div>
						</div>
					</li>
                                        <%-- <li class="grid"><a class="color2" href="#">	Lookbook</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.jsp">Accessories</a></li>
										<li><a href="products.jsp">Bags</a></li>
										<li><a href="products.jsp">Caps & Hats</a></li>
										<li><a href="products.jsp">Hoodies & Sweatshirts</a></li>
										<li><a href="products.jsp">Jackets & Coats</a></li>
										<li><a href="products.jsp">Jeans</a></li>
										<li><a href="products.jsp">Jewellery</a></li>
										<li><a href="products.jsp">Jumpers & Cardigans</a></li>
										<li><a href="products.jsp">Leather Jackets</a></li>
										<li><a href="products.jsp">Long Sleeve T-Shirts</a></li>
										<li><a href="products.jsp">Loungewear</a></li>
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.jsp">Shirts</a></li>
										<li><a href="products.jsp">Shoes, Boots & Trainers</a></li>
										<li><a href="products.jsp">Shorts</a></li>
										<li><a href="products.jsp">Suits & Blazers</a></li>
										<li><a href="products.jsp">Sunglasses</a></li>
										<li><a href="products.jsp">Sweatpants</a></li>
										<li><a href="products.jsp">Swimwear</a></li>
										<li><a href="products.jsp">Trousers & Chinos</a></li>
										<li><a href="products.jsp">T-Shirts</a></li>
										<li><a href="products.jsp">Underwear & Socks</a></li>
										<li><a href="products.jsp">Vests</a></li>
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="products.jsp">Levis</a></li>
										<li><a href="products.jsp">Persol</a></li>
										<li><a href="products.jsp">Nike</a></li>
										<li><a href="products.jsp">Edwin</a></li>
										<li><a href="products.jsp">New Balance</a></li>
										<li><a href="products.jsp">Jack & Jones</a></li>
										<li><a href="products.jsp">Paul Smith</a></li>
										<li><a href="products.jsp">Ray-Ban</a></li>
										<li><a href="products.jsp">Wood Wood</a></li>
									</ul>	
								</div>												
							</div>
						  </div>
						</div>--%>
			    </li>
				<li><a class="color4" href="blog.jsp">Blog</a></li>				
				<li><a class="color6" href="contact.jsp">Conact</a></li>
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>

	</div>

	
<!--content-->
<div class="container">
		<div class="account">
		<h1>Account</h1>
		<div class="account-pass">
		<div class="col-md-8 account-top">
                    <form action="log1.jsp" method="get" onsubmit="return validate();">
				
			<div> 	
				<span>User Name</span>
                                <input type="text" name="un"><span id="un"></span>
			</div>
			<div> 
				<span >Password</span>
                                <input type="password" name="pass"><span id="pass"></span>
			</div>				
				<input type="submit" value="Login"> 
			</form>
		</div>
		<div class="col-md-4 left-account ">
			<a href="single.jsp"><img class="img-responsive " src="images/s1.jpg" alt=""></a>
			<div class="five">
			<h2>25% </h2><span>discount</span>
			</div>
			<a href="register.html" class="create">Create an account</a>
<div class="clearfix"> </div>
		</div>
	<div class="clearfix"> </div>
	</div>
	</div>

</div>

<!--//content-->
<div class="footer">
				<div class="container">
			<div class="footer-top-at">
			
				<div class="col-md-4 amet-sed">
				<h4>MORE INFO</h4>
				<ul class="nav-bottom">
						<li><a href="#">How to order</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="contact.html">Location</a></li>
						<li><a href="#">Shipping</a></li>
						<li><a href="#">Membership</a></li>	
					</ul>	
				</div>
				<div class="col-md-4 amet-sed ">
				<h4>CONTACT US</h4>
				
					<p>
Contrary to popular belief</p>
					<p>The standard chunk</p>
					<p>office:  +12 34 995 0792</p>
					<ul class="social">
						<li><a href="#"><i> </i></a></li>						
						<li><a href="#"><i class="twitter"> </i></a></li>
						<li><a href="#"><i class="rss"> </i></a></li>
						<li><a href="#"><i class="gmail"> </i></a></li>
						
					</ul>
				</div>
				<div class="col-md-4 amet-sed">
					<h4>Newsletter</h4>
					<p>Sign Up to get all news update
and promo</p>
					<form>
						<input type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}">
						<input type="submit" value="Sign up">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-class">
		<p >� 2015 New store All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
		</div>
		</div>
</body>
</html>
			