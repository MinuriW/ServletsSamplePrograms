package com.hcl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = {"/Display"})
public class Display extends HttpServlet {


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
HttpSession session = request.getSession();

String eventName = (String)session.getAttribute("eventName");


out.println("<html><body><center><h1>Event Management System</h1>");
out.println("<div>Event "+eventName+" is planned to held on 2018-09-05 in Rudolfinum.</div>");

 
out.println("</center></body></html>");
out.close();
}

 
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
doGet(request, response);
}

 

 

 

}