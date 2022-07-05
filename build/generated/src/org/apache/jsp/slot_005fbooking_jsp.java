package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.TimeZone;
import java.lang.String;
import java.sql.Statement;
import DBconnection.SQLconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public final class slot_005fbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String pdate = request.getParameter("pdate");
    String stime = request.getParameter("stime")+":00";
    String phrs = request.getParameter("phrs")+":00";
    String nump = request.getParameter("nump");
    String slot_name = request.getParameter("Slot");
    String totalcost = request.getParameter("totalcost");
    String psn = request.getParameter("psp");
    

    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

    Date date1 = timeFormat.parse(stime);
    Date date2 = timeFormat.parse(phrs);
    
    long sum = date1.getTime() + date2.getTime();
    String etime = timeFormat.format(new Date(sum));


    System.out.println("start time : " + stime);
    System.out.println("parking hrs : " + phrs);
    System.out.println("End time : " + etime);

    String uid = (String) session.getAttribute("uid");
    String uname = (String) session.getAttribute("uname");
    String umail = (String) session.getAttribute("umail");
    Connection con = SQLconnection.getconnection();
    Statement st = con.createStatement();
    Statement st1 = con.createStatement();
    try {
        ResultSet rs = st.executeQuery("SELECT * FROM slot_booking WHERE pdate ='" + pdate + "' AND stime = '" + stime + "' AND slot_name = '" + slot_name + "' ");
        if (rs.next() == true)
        {
            response.sendRedirect("Book_parking.jsp?Already Booked");
        } 
        else 
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String time = dateFormat.format(date);
            System.out.println("Date and Time : " + time);
            int i = st1.executeUpdate("INSERT INTO slot_booking(uname, uid, pdate, stime, phrs, umail, slot_name, time, endtime, pcost,nump,psname) values('" + uname + "','" + uid + "','" + pdate + "','" + stime + "','" + phrs + "','" + umail + "', '" + slot_name + "','" + time + "','"+ etime +"','"+totalcost+"','"+ nump +"','"+ psn +"')");
            if (i != 0) 
            {
                response.sendRedirect("Book_parking.jsp?Slot_booked");
            } 
            else {
                response.sendRedirect("Book_parking.jsp?Failed");
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

      out.write("\n");
      out.write("<form action=\"mail_noti\" method=\"post\">\n");
      out.write("    ");

    String umail2 = (String) session.getAttribute("umail");
    
      out.write("\n");
      out.write("</form>\n");
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
