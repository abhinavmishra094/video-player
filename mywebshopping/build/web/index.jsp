
<!DOCTYPE html>
<html>
<head>
    <title style="icon: url(images/cart.png)">E Shopping Websites: Made by Abhinav Mishra</title>
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
                    
                    <%
                      String user=(String)session.getAttribute("a");
                      
                      if(user==null)
                      {
                    %>
			<div class="header-left">		
					<ul>
						<li ><a href="login.jsp"  >Login</a></li>
						<li><a  href="register.jsp"  >Register</a></li>

					</ul>
					<div class="cart box_1">
						<a href="checkout.jsp">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>
                        
                    <%
                      }
                      else
                      {
                       %>
                          
                       <div class="header-left">		
					<ul>
                                            <li ><a href="profile1.jsp"  ><%=user%></a></li>
					    <li ><a href="signout.jsp"  >Sign Out</a></li>

					</ul>
					<div class="cart box_1">
						<a href="checkout.jsp">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>   
                          
                          
                    <%      
                      }
                    
                    %>
                    
                    
                    
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
				
				<div class="clearfix"> </div>
		</div>
		</div>

	</div>

	<div class="banner">
		<div class="container">
			  <script src="js/responsiveslides.min.js"></script>
  <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>
					
						
				</li>
				<li>
					
						<div class="banner-text">
							<h3>There are many variations </h3>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor .</p>
												<a href="single.jsp">Learn More</a>

						</div>
					
				</li>
				<li>
						<div class="banner-text">
							<h3>Sed ut perspiciatis unde omnis</h3>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor .</p>
								<a href="single.jsp">Learn More</a>

						</div>
					
				</li>
			</ul>
		</div>

	</div>
	</div>

<!--content-->
<div class="content">
	<div class="container">
	<div class="content-top">
		<h1>POPULAR PRODUCTS</h1>
		<div class="grid-in">
			<div class="col-md-4 grid-top">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pii.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>PC</span>	
									</h3>
								</div>
				</a>
		

			<p><a href="single.jsp">lAPTOP</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pi11.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Laptop</span>	
									</h3>
								</div>
				</a>
			<p><a href="single.jsp">Laptop</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/66.png" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Mouse</span>	
									</h3>
								</div>
				</a>
			<p><a href="single.jsp">Mouse</a></p>
			</div>
					<div class="clearfix"> </div>
		</div>
		<div class="grid-in">
			<div class="col-md-4 grid-top">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pi44.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Server</span>	
									</h3>
								</div>
				</a>
			<p><a href="single.jsp">Server</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/mon.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Monitors</span>	
									</h3>
								</div>
				</a>
			<p><a href="single.jsp">Monitors</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/hdd.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Hard Disk</span>	
									</h3>
								</div>
				</a>
			<p><a href="single.jsp">Hard Disk</a></p>
			</div>
					<div class="clearfix"> </div>
		</div>
	</div>
	<!----->
	
	<div class="content-top-bottom">
		<h2>Featured Collections</h2>
		<div class="col-md-6 men">
                    <a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/t.jpg" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span>AOC Monitor</span>	
									</h3>
								</div>
			</a>
			
			
		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/6s.png" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>Iphone 6S</span>	
									</h3>
								</div>
				</a>
				
			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pro4.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>Surface Pro 4</span>	
									</h3>
								</div>
					</a>
					
				</div>
				<div class="col-md-6 men2">
					<a href="single.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/hp30.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>2 in 1</span>	
									</h3>
								</div>
					</a>
					
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	</div>
	<!---->
	<div class="content-bottom">
		<ul>
			<li><a href="#"><img class="img-responsive" src="images/lo11.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="images/lo10.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="images/lo9.png" alt=""></a></li>
                        <li><a href="#"><img class="img-responsive" src="images/lo8.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="images/lo7.png" alt=""></a></li>
			<li><a href="#"><img class="img-responsive" src="images/lo6.png" alt=""></a></li>
		<div class="clearfix"> </div>
		</ul>
	</div>
</div>
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
					<p>office:  +91 9450455997</p>
					<ul class="social">
						<li><a href="https://www.facebook.com/abhinavmishra094"><i> </i></a></li>						
						<li><a href="https://twitter.com/abhin12345"><i class="twitter"> </i></a></li>
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
		<p >© 2015 New store All Rights Reserved | Design by  Abhinav </a> </p>
		</div>
		</div>
</body>
</html>
			