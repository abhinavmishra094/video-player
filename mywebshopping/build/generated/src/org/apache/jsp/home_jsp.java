package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("\t<div class=\"header-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Search \" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Go\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-left\">\n");
      out.write("                                  \n");
      out.write("                                                ");
    
       String user=(String)session.getAttribute("a");
                                                
      out.write("\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <li >\n");
      out.write("                                                <font style=\"color: #ffffff\">");
      out.print(user);
      out.write(" </font>\n");
      out.write("                                                \n");
      out.write("                                            </li>\n");
      out.write("\t\t\t\t\t\t<li><a  href=\"#\"  >Profile</a></li>\n");
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
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head-top\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("                                    <a href=\"home.jsp\"><img src=\"images/logo.png\" alt=\"\"></a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t  <div class=\" h_menu4\">\n");
      out.write("\t\t\t\t<ul class=\"memenu skyblue\">\n");
      out.write("                                    <li class=\"active grid\"><a class=\"color8\" href=\"home.jsp\">Home</a></li>\t\n");
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
      out.write("\t\t\t\t<li><a class=\"color4\" href=\"blog.html\">Blog</a></li>\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"color6\" href=\"contact.html\">Conact</a></li>\n");
      out.write("\t\t\t  </ul> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("        <table style=\"width: 100%; height: 500px;\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("                            <table style=\"width: 100%\">\n");
      out.write("                                <tr><td>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("                                    </td></tr></table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
