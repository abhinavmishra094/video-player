package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>E Shopping Websites: Made by Abhinav Mishra</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->\n");
      out.write("<!-- start menu -->\n");
      out.write("<link href=\"css/memenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/memenu.js\"></script>\n");
      out.write("<script>$(document).ready(function(){$(\".memenu\").memenu();});</script>\n");
      out.write("<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--header-->\n");
      out.write("<div class=\"header\">\n");
      out.write("\t<div class=\"header-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Search \" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Go\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    \n");
      out.write("                    ");

                      String user=(String)session.getAttribute("a");
                      
                      if(user==null)
                      {
                    
      out.write("\n");
      out.write("\t\t\t<div class=\"header-left\">\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"login.jsp\"  >Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a  href=\"register.jsp\"  >Register</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t\t\t<h3> <div class=\"total\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/cart.png\" alt=\"\"/></h3>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("                    ");

                      }
                      else
                      {
                       
      out.write("\n");
      out.write("                          \n");
      out.write("                       <div class=\"header-left\">\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <li ><a href=\"profile.jsp\"  >");
      out.print(user);
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t    <li ><a href=\"signout.jsp\"  >Sign Out</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t\t\t<h3> <div class=\"total\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/cart.png\" alt=\"\"/></h3>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>   \n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                    ");
      
                      }
                    
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head-top\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"></a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t  <div class=\" h_menu4\">\n");
      out.write("\t\t\t\t<ul class=\"memenu skyblue\">\n");
      out.write("\t\t\t\t\t  <li class=\"active grid\"><a class=\"color8\" href=\"index.jsp\">Home</a></li>\t\n");
      out.write("\t\t\t\t      <li><a class=\"color1\" href=\"#\">Men</a>\n");
      out.write("\t\t\t\t      \t<div class=\"mepanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Hoodies & Sweatshirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jackets & Coats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jumpers & Cardigans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Leather Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Long Sleeve T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Loungewear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes, Boots & Trainers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shorts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Suits & Blazers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Sweatpants</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Trousers & Chinos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Underwear & Socks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Vests</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Levis</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Persol</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Nike</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Edwin</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">New Balance</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jack & Jones</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Paul Smith</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Ray-Ban</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wood Wood</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t    <li class=\"grid\"><a class=\"color2\" href=\"#\">\tWomen</a>\n");
      out.write("\t\t\t\t\t  \t<div class=\"mepanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Hoodies & Sweatshirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jackets & Coats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jumpers & Cardigans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Leather Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Long Sleeve T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Loungewear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes, Boots & Trainers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shorts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Suits & Blazers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Sweatpants</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Trousers & Chinos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Underwear & Socks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Vests</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Levis</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Persol</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Nike</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Edwin</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">New Balance</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jack & Jones</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Paul Smith</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Ray-Ban</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wood Wood</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t\t<li><a class=\"color4\" href=\"blog.jsp\">Blog</a></li>\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"color6\" href=\"contact.jsp\">Conact</a></li>\n");
      out.write("\t\t\t  </ul> \n");
      out.write("\t\t\t</div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-top-at\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed\">\n");
      out.write("\t\t\t\t<h4>MORE INFO</h4>\n");
      out.write("\t\t\t\t<ul class=\"nav-bottom\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">How to order</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Location</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Shipping</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Membership</a></li>\t\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed \">\n");
      out.write("\t\t\t\t<h4>CONTACT US</h4>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("Contrary to popular belief</p>\n");
      out.write("\t\t\t\t\t<p>The standard chunk</p>\n");
      out.write("\t\t\t\t\t<p>office:  +91 9450455997</p>\n");
      out.write("\t\t\t\t\t<ul class=\"social\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i></a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twitter\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"rss\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"gmail\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed\">\n");
      out.write("\t\t\t\t\t<h4>Newsletter</h4>\n");
      out.write("\t\t\t\t\t<p>Sign Up to get all news update\n");
      out.write("and promo</p>\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='';}\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer-class\">\n");
      out.write("\t\t<p >Â© 2015 New store All Rights Reserved | Design by  Abhinav </a> </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\t\t\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
