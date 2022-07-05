package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.TimeZone;
import java.lang.String;
import java.sql.Statement;
import DBconnection.SQLconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public final class Book_005fparking1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"twitter:title\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:image\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:url\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"\" />\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"booking/booking.css\">\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('.slectOne').on('change', function () {\n");
      out.write("                $('.slectOne').not(this).prop('checked', false);\n");
      out.write("                $('#result').html($(this).data(\"id\"));\n");
      out.write("                if ($(this).is(\":checked\"))\n");
      out.write("                    $('#result').html($(this).data(\"id\"));\n");
      out.write("                else\n");
      out.write("                    $('#result').html('Empty...!');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"colorlib-page\">\n");
      out.write("            <a class=\"js-colorlib-nav-toggle colorlib-nav-toggle\"><i></i></a>\n");
      out.write("            <aside id=\"colorlib-aside\" role=\"complementary\" class=\"border js-fullheight\">\n");
      out.write("                <h1 id=\"colorlib-logo\"></h1>\n");
      out.write("                <nav id=\"colorlib-main-menu\" role=\"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"User_Home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"parking_cost1.jsp\">Parking Cost</a></li>\n");
      out.write("                        <li class=\"colorlib-active\"><a href=\"Book_parking.jsp\">Book Parking</a></li>\n");
      out.write("                        <li><a href=\"your_bookings.jsp\">Your Bookings</a></li>\n");
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
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <center><h2>Book Parking Slot</h2></center>\n");
      out.write("                            <br><br>\n");
      out.write("                            <form  action=\"slot_booking.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("                                ");

                                    String pdate = request.getParameter("date");
                                    String stime = request.getParameter("stime");
                                    String phrs = request.getParameter("phrs");
                                    System.out.println(phrs);
                                    System.out.println(stime);

                                    int pcost = 0;
                                    int totalcost = 0;

                                    String phrs1 = phrs + ":00";
                                    String stime1 = stime + ":00";
                                    String phrs2 = phrs1 + ":00";

                                    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                                    timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

                                    Date date1 = timeFormat.parse(stime1);
                                    Date date2 = timeFormat.parse(phrs2);

                                    long sum = date1.getTime() + date2.getTime();
                                    String etime = timeFormat.format(new Date(sum));

                                    System.out.println("start time : " + stime1);
                                    System.out.println("parking hrs : " + phrs2);
                                    System.out.println("End time : " + etime);

                                    Connection con = SQLconnection.getconnection();
                                    Statement st2 = con.createStatement();

                                    try {
                                        ResultSet rt = st2.executeQuery("SELECT * FROM parking_cost");
                                        while (rt.next()) {
                                            pcost = rt.getInt("cost");
                                            System.out.println(pcost);
                                        }
                                        int hrs = Integer.parseInt(phrs);
                                        totalcost = pcost * hrs;

                                        System.out.println(totalcost);

                                    } 
                                    catch (Exception ex) {
                                        ex.printStackTrace();
                                    }
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-10 col-md-offset-1 col-md-pull-1 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Date :</label>\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" name=\"pdate\" value=\"");
      out.print(pdate);
      out.write("\" readonly=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Start Time :</label>\n");
      out.write("                                                <input type=\"text\" name=\"stime\" class=\"form-control\" value=\"");
      out.print(stime);
      out.write("\"readonly=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Parking Hours :</label>\n");
      out.write("                                                <input type=\"text\" name=\"phrs\" class=\"form-control\" value=\"");
      out.print(phrs1);
      out.write("\"readonly=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Parking cost in Rupees :</label>\n");
      out.write("                                                <input type=\"text\" name=\"totalcost\" class=\"form-control\" value=\"");
      out.print(totalcost);
      out.write("\"readonly=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Payment Mode :</label><br>\n");
      out.write("                                                &nbsp;&nbsp;Cash&nbsp;&nbsp;<input type=\"radio\" id=\"cash\" value=\"Cash\" checked=\"\" />&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                UPI&nbsp;&nbsp;<input type=\"radio\" value=\"UPI\" disabled=\"\" />&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                Credit Card&nbsp;&nbsp;<input type=\"radio\" value=\"Credit cards\" disabled=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <br><br><br><br><br>\n");
      out.write("                                    <table id=\"seatsBlock\">\n");
      out.write("                                        <p id=\"notification\"></p>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td style=\"color: black;\">1</td>\n");
      out.write("                                            <td style=\"color: black;\">2</td>\n");
      out.write("                                            <td style=\"color: black;\">3</td>\n");
      out.write("                                            <td style=\"color: black;\">4</td>\n");
      out.write("                                            <td style=\"color: black;\">5</td>\n");
      out.write("                                            <td style=\"color: black;\"></td>\n");
      out.write("                                            <td style=\"color: black;\">6</td>\n");
      out.write("                                            <td style=\"color: black;\">7</td>\n");
      out.write("                                            <td style=\"color: black;\">8</td>\n");
      out.write("                                            <td style=\"color: black;\">9</td>\n");
      out.write("                                            <td style=\"color: black;\">10</td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            String slot_name;

                                            ArrayList<String> s1 = new ArrayList<>();
                                            Statement st = con.createStatement();
                                            Statement st1 = con.createStatement();
                                            Statement st4 = con.createStatement();
                                            ResultSet rs = null;
                                            ResultSet rs1 = null;
                                            ResultSet rs2 = null;
                                            try 
                                            {
                                                rs1 = st1.executeQuery("SELECT * FROM slot_booking WHERE pdate ='" + pdate + "' AND  '" + stime + ":00' BETWEEN stime AND endtime ");
                                                while (rs1.next()) 
                                                {
                                                    s1.add(rs1.getString("slot_name"));
                                                    System.out.println(s1);
                                                }
                                                rs2 = st4.executeQuery("SELECT * FROM slot_booking WHERE pdate ='" + pdate + "' AND  '" + etime + "' BETWEEN stime AND endtime ");
                                                while (rs2.next()) 
                                                {
                                                    s1.add(rs2.getString("slot_name"));
                                                    System.out.println(s1);
                                                }
                                                rs = st.executeQuery("SELECT * FROM slot_booking WHERE pdate ='" + pdate + "' AND  '" + stime + ":00' AND '"+ etime +"' BETWEEN stime AND endtime ");
                                                if (rs.next() != true) 
                                                {

                                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: black;\">A</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 1\" data-id=\"Slot 1\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 2\" data-id=\"Slot 2\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 3\" data-id=\"Slot 3\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 4\" data-id=\"Slot 4\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 5\" data-id=\"Slot 5\" />\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"seatGap\"></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 6\" value=\"Slot 1\" data-id=\"Slot 6\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 7\" data-id=\"Slot 7\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 8\" data-id=\"Slot 8\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 9\" data-id=\"Slot 9\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 10\" data-id=\"Slot 10\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: black;\">B</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 11\" data-id=\"Slot 11\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 12\" data-id=\"Slot 12\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 13\" data-id=\"Slot 13\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 14\" data-id=\"Slot 14\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 15\" data-id=\"Slot 15\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 16\" data-id=\"Slot 16\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 17\" data-id=\"Slot 17\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 18\" data-id=\"Slot 18\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 19\" data-id=\"Slot 19\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 20\" data-id=\"Slot 20\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: black;\">C</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 21\" data-id=\"Slot 21\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 22\" data-id=\"Slot 22\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 23\" data-id=\"Slot 23\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 24\" data-id=\"Slot 24\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 25\" data-id=\"Slot 25\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 26\" data-id=\"Slot 26\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 27\" data-id=\"Slot 27\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 28\" data-id=\"Slot 28\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 29\" data-id=\"Slot 29\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 30\" data-id=\"Slot 30\"/>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: black;\">A</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 1\" data-id=\"Slot 1\" \n");
      out.write("                                                       ");
 if (s1.contains("Slot 1")) {
                                                               out.print("disabled=\'disabled \'");
                                                           }
      out.write(" />\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 2\" data-id=\"Slot 2\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 2")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 3\" data-id=\"Slot 3\"\n");
      out.write("                                                       ");
if (s1.contains("Slot 3")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 4\" data-id=\"Slot 4\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 4")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 5\" data-id=\"Slot 5\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 5")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write(" />\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"seatGap\"></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 6\" value=\"Slot 1\" data-id=\"Slot 6\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 6")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 7\" data-id=\"Slot 7\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 7")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 8\" data-id=\"Slot 8\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 8")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 9\" data-id=\"Slot 9\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 9")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 10\" data-id=\"Slot 10\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 10")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: black;\">B</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 11\" data-id=\"Slot 11\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 11")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 12\" data-id=\"Slot 12\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 12")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 13\" data-id=\"Slot 13\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 13")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 14\" data-id=\"Slot 14\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 14")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 15\" data-id=\"Slot 15\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 15")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 16\" data-id=\"Slot 16\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 16")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 17\" data-id=\"Slot 17\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 17")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 18\" data-id=\"Slot 18\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 18")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 19\" data-id=\"Slot 19\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 19")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 20\" data-id=\"Slot 20\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 20")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: black;\">C</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 21\" data-id=\"Slot 21\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 21")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 22\" data-id=\"Slot 22\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 22")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 23\" data-id=\"Slot 23\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 23")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 24\" data-id=\"Slot 24\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 24")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 25\" data-id=\"Slot 25\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 25")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 26\" data-id=\"Slot 26\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 26")) {
                                                               out.print("checked=\'checked\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 27\" data-id=\"Slot 27\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 27")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 28\" data-id=\"Slot 28\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 28")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 29\" data-id=\"Slot 29\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 29")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"checkbox\" class=\"slectOne\" name=\"Slot\" value=\"Slot 30\" data-id=\"Slot 30\"\n");
      out.write("                                                       ");
 if (s1.contains("Slot 30")) {
                                                               out.print("disabled=\'disabled\'");
                                                           }
      out.write("/>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                                }
                                            } catch (Exception ex) {
                                                ex.printStackTrace();
                                            }
                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                    <span id=\"result\" style=\"color: black;\"></span>\n");
      out.write("                                    <br><br><br>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <br><br><br>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-success btn-md\">Book</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
