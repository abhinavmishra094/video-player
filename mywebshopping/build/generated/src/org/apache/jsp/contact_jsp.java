package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\t      <li><a class=\"color1\" href=\"#\">Electronics</a>\r\n");
      out.write("\t\t\t\t      \t<div class=\"mepanel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">External Hardisk</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Internal Hardisk</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Ram</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Monitors</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Micro Processors</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">PC Cabinet </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Mobiles</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">PC Power Supply</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Cables</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Consoles</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Games</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                        ");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">HP</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Accer</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Lenovo</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Aus</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Gigabyte</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Razer</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Apple</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Smasung</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Sony</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Toshiba</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Dell</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("                                        ");
      out.write("\r\n");
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
      out.write("<div class=\"contact\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h1>Contact</h1>\r\n");
      out.write("\t\t\t<div class=\"contact-form\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 contact-grid\">\r\n");
      out.write("\t\t\t\t\t<form>\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Name\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='Name';}\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Email\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='Email';}\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Subject\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='Subject';}\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<textarea cols=\"77\" rows=\"6\" value=\" \" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value = 'Message';}\">Message</textarea>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"send\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Send\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-in\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"address-more\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Address</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>The company name,</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor,</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Glasglow Dr 40 Fe 72. </p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"address-more\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Address1</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<p>Email:<a href=\"mailto:contact@example.com\"> contact@example.com</a></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"map\">\r\n");
      out.write("\t\t\t\t<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771\"></iframe>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
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
      out.write("\t\t\t\t\t<p>office:  9450455997 </p>\r\n");
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
      out.write("\t\t<p >Â© 2015 New store All Rights Reserved | Design by  Abhinav Mishra</a> </p>\r\n");
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
