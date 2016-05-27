package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blog_005fsingle_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>E Shopping Websites: Made by Abhinav Mishra</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<!--theme-style-->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\r\n");
      out.write("<!--//theme-style-->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--fonts-->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->\r\n");
      out.write("<!-- start menu -->\r\n");
      out.write("<link href=\"css/memenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/memenu.js\"></script>\r\n");
      out.write("<script>$(document).ready(function(){$(\".memenu\").memenu();});</script>\r\n");
      out.write("<script src=\"js/simpleCart.min.js\"> </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--header-->\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<div class=\"header-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Search \" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Go\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                      String user=(String)session.getAttribute("a");
                      
                      if(user==null)
                      {
                    
      out.write("\r\n");
      out.write("\t\t\t<div class=\"header-left\">\t\t\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"login.jsp\"  >Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a  href=\"register.jsp\"  >Register</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<h3> <div class=\"total\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/cart.png\" alt=\"\"/></h3>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                        \r\n");
      out.write("                    ");

                      }
                      else
                      {
                       
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("                       <div class=\"header-left\">\t\t\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("                                            <li ><a href=\"profile1.jsp\"  >");
      out.print(user);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t    <li ><a href=\"signout.jsp\"  >Sign Out</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<h3> <div class=\"total\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/cart.png\" alt=\"\"/></h3>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>   \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                    ");
      
                      }
                    
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"head-top\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"></a>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t  <div class=\" h_menu4\">\r\n");
      out.write("\t\t\t\t<ul class=\"memenu skyblue\">\r\n");
      out.write("\t\t\t\t\t  <li class=\"active grid\"><a class=\"color8\" href=\"index.jsp\">Home</a></li>\t\r\n");
      out.write("\t\t\t\t      <li><a class=\"color1\" href=\"#\">Men</a>\r\n");
      out.write("\t\t\t\t      \t<div class=\"mepanel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Bags</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Caps & Hats</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Hoodies & Sweatshirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jackets & Coats</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jeans</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jewellery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jumpers & Cardigans</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Leather Jackets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Long Sleeve T-Shirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Loungewear</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Shirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Shoes, Boots & Trainers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Shorts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Suits & Blazers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Sunglasses</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Sweatpants</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Swimwear</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Trousers & Chinos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">T-Shirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Underwear & Socks</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Vests</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Levis</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Persol</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Nike</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Edwin</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">New Balance</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jack & Jones</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Paul Smith</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Ray-Ban</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Wood Wood</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t    <li class=\"grid\"><a class=\"color2\" href=\"#\">\tLookbook</a>\r\n");
      out.write("\t\t\t\t\t  \t<div class=\"mepanel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Bags</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Caps & Hats</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Hoodies & Sweatshirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jackets & Coats</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jeans</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jewellery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jumpers & Cardigans</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Leather Jackets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Long Sleeve T-Shirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Loungewear</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Shirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Shoes, Boots & Trainers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Shorts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Suits & Blazers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Sunglasses</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Sweatpants</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Swimwear</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Trousers & Chinos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">T-Shirts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Underwear & Socks</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Vests</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Levis</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Persol</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Nike</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Edwin</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">New Balance</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Jack & Jones</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Paul Smith</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Ray-Ban</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Wood Wood</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    </li>\r\n");
      out.write("\t\t\t\t<li><a class=\"color4\" href=\"blog.jsp\">Blog</a></li>\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><a class=\"color6\" href=\"contact.jsp\">Conact</a></li>\r\n");
      out.write("\t\t\t  </ul> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!--content-->\r\n");
      out.write("<div class=\"blog\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t       <div class=\"blog-top\">\r\n");
      out.write("\t\t\t  <div class=\" grid_3 grid-1\">\r\n");
      out.write("\t\t\t\t\t<h3><a href=\"blog_single.html\">Lorem Ipsum is simply</a></h3>\r\n");
      out.write("\t\t\t\t\t<a href=\"blog_single.html\"><img src=\"images/blo.jpg\" class=\"img-responsive\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"blog-poast-info\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"admin\" href=\"#\"><i> </i> Admin </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><span><i class=\"date\"> </i>12-04-2015</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"p-blog\" href=\"#\"><i class=\"comment\"> </i>No Comments</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,</p>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"single-bottom\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<h3>Leave A Comment</h3>\r\n");
      out.write("\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Name\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='Name';}\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Email\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='Email';}\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Subject\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='Subject';}\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<textarea cols=\"77\" rows=\"6\" value=\" \" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value = 'Message';}\">Message</textarea>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Send\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("      </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--//content-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"footer-top-at\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed\">\r\n");
      out.write("\t\t\t\t<h4>MORE INFO</h4>\r\n");
      out.write("\t\t\t\t<ul class=\"nav-bottom\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">How to order</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Shipping</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Membership</a></li>\t\r\n");
      out.write("\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed \">\r\n");
      out.write("\t\t\t\t<h4>CONTACT US</h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("Contrary to popular belief</p>\r\n");
      out.write("\t\t\t\t\t<p>The standard chunk</p>\r\n");
      out.write("\t\t\t\t\t<p>office:  +12 34 995 0792</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"social\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i></a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twitter\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"rss\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"gmail\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed\">\r\n");
      out.write("\t\t\t\t\t<h4>Newsletter</h4>\r\n");
      out.write("\t\t\t\t\t<p>Sign Up to get all news update\r\n");
      out.write("and promo</p>\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='';}\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer-class\">\r\n");
      out.write("\t\t<p >Â© 2015 New store All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
