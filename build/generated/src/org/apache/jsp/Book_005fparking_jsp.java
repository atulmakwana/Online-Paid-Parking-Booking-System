package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Book_005fparking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.css\" rel=\"stylesheet\"/>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-timepicker/1.8.9/jquery.timepicker.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-timepicker/1.8.9/jquery.timepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");

        if (request.getParameter("Slot_booked") != null) {
    
      out.write("\n");
      out.write("    <script>alert('Slot Booked');</script>\n");
      out.write("    ");
            }
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(function () {\n");
      out.write("            for (var i = 1; i <= 6; i += 1) {\n");
      out.write("                $('#meeting').append('<option value=\"0' + i + '\">' + i + '   hrs' + '</option>');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            for (var i = 6; i <= 18; i += 1) {\n");
      out.write("                $('#stime1').append('<option value=\"' + i + ':00\">' + i + '   :00' + '</option>');\n");
      out.write("            }\n");
      out.write("            function setEndTime() {\n");
      out.write("                var meetingLength = parseInt($('#meeting').find('option:selected').val() || 0);\n");
      out.write("                var selectedTime = $('#stime').timepicker('getTime');\n");
      out.write("                if (selectedTime == null || selectedTime == \"\") {\n");
      out.write("                    alert(\"Please select the start time.\");\n");
      out.write("                } else {\n");
      out.write("                    selectedTime.setMinutes(selectedTime.getMinutes() + parseInt(meetingLength, 10), 0);\n");
      out.write("                    $('#etime').timepicker('setTime', selectedTime);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $('#stime').timepicker({\n");
      out.write("                'timeFormat': 'h:i a',\n");
      out.write("                'minTime': '8:00 AM',\n");
      out.write("                'maxTime': '5:00 PM',\n");
      out.write("                'step': 30\n");
      out.write("            }).on(function () {\n");
      out.write("                setEndTime();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#etime').timepicker({\n");
      out.write("                'timeFormat': 'h:i a',\n");
      out.write("                'minTime': '8:00 AM',\n");
      out.write("                'maxTime': '5:00 PM',\n");
      out.write("                'step': 5\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#meeting').bind('change', function () {\n");
      out.write("                setEndTime();\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        function getInputDateFormat(date) {\n");
      out.write("            return date.toISOString().split('T')[0];\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function validDate() {\n");
      out.write("            var today = new Date();\n");
      out.write("            var maxDate = new Date();\n");
      out.write("            maxDate.setDate(maxDate.getDate() + 365);\n");
      out.write("\n");
      out.write("            document.getElementsByName(\"date\")[0].setAttribute('min', getInputDateFormat(today));\n");
      out.write("            document.getElementsByName(\"date\")[0].setAttribute('max', getInputDateFormat(maxDate));\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <body onload=\"validDate()\">\n");
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
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-md-push-2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-10 col-md-offset-1 col-md-pull-1 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                        <form  action=\"Book_parking1.jsp\" method=\"post\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Select Date :</label>\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" name=\"date\" id=\"date\" required=\"required\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Select Parking Time :</label>\n");
      out.write("                                                <select name=\"stime\" required=\"required\" class=\"form-control\">\n");
      out.write("                                                    <option value=\"\">--Select Time--</option>\n");
      out.write("                                                    <option>06:00</option>\n");
      out.write("                                                    <option>07:00</option>\n");
      out.write("                                                    <option>08:00</option>\n");
      out.write("                                                    <option>09:00</option>\n");
      out.write("                                                    <option>10:00</option>\n");
      out.write("                                                    <option>11:00</option>\n");
      out.write("                                                    <option>12:00</option>\n");
      out.write("                                                    <option>13:00</option>\n");
      out.write("                                                    <option>14:00</option>\n");
      out.write("                                                    <option>15:00</option>\n");
      out.write("                                                    <option>16:00</option>\n");
      out.write("                                                    <option>17:00</option>\n");
      out.write("                                                    <option>18:00</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Enter Parking Hours :</label>\n");
      out.write("                                                <select name=\"phrs\" id=\"meeting\" class=\"form-control\" required=\"required\">\n");
      out.write("                                                    <option value=\"\">--Select Hours--</option>\n");
      out.write("                                                    <option>1</option>\n");
      out.write("                                                    <option>2</option>\n");
      out.write("                                                    <option>3</option>\n");
      out.write("                                                    <option>4</option>\n");
      out.write("                                                    <option>5</option>\n");
      out.write("                                                    <option>6</option>\n");
      out.write("                                                    <option>7</option>\n");
      out.write("                                                    <option>8</option>\n");
      out.write("                                                    <option>9</option>\n");
      out.write("                                                    <option>10</option>\n");
      out.write("                                                    \n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                &nbsp;&nbsp;<label>Enter Vehicle number :</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"numplate\" id=\"numplate\" required=\"required\">\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-success btn-md\">Select Slot</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var timepicker = new TimePicker('time', {\n");
      out.write("                lang: 'en',\n");
      out.write("                theme: 'dark'\n");
      out.write("            });\n");
      out.write("            timepicker.on('change', function (evt) {\n");
      out.write("\n");
      out.write("                var value = (evt.hour || '00') + ':' + (evt.minute || '00');\n");
      out.write("                evt.element.value = value;\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
