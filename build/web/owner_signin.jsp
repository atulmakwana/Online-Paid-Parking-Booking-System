

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="DBconnection.SQLconnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form  action="change_slots.jsp" method="post">
<%
    String mail = request.getParameter("email");
    String pass = request.getParameter("pass");

    System.out.println("Check User name And Password : " + mail + pass);
    Connection con = SQLconnection.getconnection();
    Statement st = con.createStatement();
    Statement sto = con.createStatement();
    try {
        ResultSet rs = st.executeQuery("SELECT * FROM owner_reg where email='" + mail + "' AND password='" + pass + "' ");
        if (rs.next()) {
            session.setAttribute("uid", rs.getString("id"));
            session.setAttribute("uname", rs.getString("name"));
            session.setAttribute("umail", rs.getString("email"));

            
            response.sendRedirect("Owner_Home.jsp?Success");
        } else {
            response.sendRedirect("Owner_login.jsp?Failed");
        }

    } catch (Exception ex) {
        ex.printStackTrace();
    }
%>
    
</form>