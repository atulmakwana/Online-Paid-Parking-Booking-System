package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import DBconnection.SQLconnection;
import java.sql.Connection;

public final class change_005fslots_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Online Parking Booking System</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <!-- Facebook and Twitter integration -->\n");
      out.write("        <meta property=\"og:title\" content=\"\"/>\n");
      out.write("        <meta property=\"og:image\" content=\"\"/>\n");
      out.write("        <meta property=\"og:url\" content=\"\"/>\n");
      out.write("        <meta property=\"og:site_name\" content=\"\"/>\n");
      out.write("        <meta property=\"og:description\" content=\"\"/>\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <!-- Flexslider  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\">\n");
      out.write("        <!-- Flaticons  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\n");
      out.write("        <!-- Owl Carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("        <!-- Theme style  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        #customers {\n");
      out.write("            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #customers td, #customers th {\n");
      out.write("            border: 2px solid black;\n");
      out.write("            align:\"center\";  cellpadding:\"0\"; cellspacing:\"2\";\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        #customers th {\n");
      out.write("            padding-top: 12px;\n");
      out.write("            padding-bottom: 12px;\n");
      out.write("            text-align: left;\n");
      out.write("            background-color: #1DA1F2;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"colorlib-page\">\n");
      out.write("            <a class=\"js-colorlib-nav-toggle colorlib-nav-toggle\"><i></i></a>\n");
      out.write("            <aside id=\"colorlib-aside\" role=\"complementary\" class=\"border js-fullheight\">\n");
      out.write("                <h1 id=\"colorlib-logo\"></h1>\n");
      out.write("                <nav id=\"colorlib-main-menu\" role=\"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Owner_Home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"view_bookings2.jsp\">View Bookings</a></li>\n");
      out.write("                         <li class=\"colorlib-active\"><a href=\"change_slots.jsp\">Slot changes</a></li>\n");
      out.write("                        <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </aside>\n");
      out.write("            <div id=\"colorlib-main\">\n");
      out.write("                <div class=\"colorlib-contact\">\n");
      out.write("                    <div class=\"colorlib-narrow-content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                <h2 class=\"colorlib-heading\">Online parking Booking System</h2>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                String mail = request.getParameter("email");
                                String pass = request.getParameter("pass");
                            
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                &nbsp;&nbsp;<label>Owner email :</label>\n");
      out.write("                                <input type=\"text\" name=\"mail\" class=\"form-control\" value=\"");
      out.print(mail);
      out.write("\"readonly=\"\">\n");
      out.write("                            </div>\n");
      out.write("                                            \n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Flexslider -->\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("        <!-- Sticky Kit -->\n");
      out.write("        <script src=\"js/sticky-kit.min.js\"></script>\n");
      out.write("        <!-- Owl carousel -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- Counters -->\n");
      out.write("        <script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("        <!-- MAIN JS -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
