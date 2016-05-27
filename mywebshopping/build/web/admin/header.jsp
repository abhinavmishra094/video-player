
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
                      String user=(String)session.getAttribute("admin");
                      
                      if(user==null)
                      {
                    %>
			<div class="header-left">		
					<ul>
						<li ><a href="login.jsp"  >Login</a></li>
						

					</ul>
					<div class="cart box_1">
						
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
                                            <li><a  href="change_password.jsp"  >Change Password</a></li>
					    <li ><a href="signout.jsp"  >Sign Out</a></li>

					</ul>
					<div class="cart box_1">
						

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
					<a href="admin.jsp"><img src="images/logo.png" alt=""></a>	
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="admin.jsp">Home</a></li>	
				      <li><a class="color1" href="#"></a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
										
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
										
								</div>												
							</div>
						  </div>
						</div>
					</li>
				    <li class="grid"><a class="color2" href="#">	</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
										
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
										
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4></h4>
										
								</div>												
							</div>
						  </div>
						</div>
			    </li>
				<li><a class="color4" href="#"></a></li>				
				<li><a class="color6" href="#"></a></li>
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>

	</div>
		
                            
                            
                            
                            
                            
</body>
</html>
			