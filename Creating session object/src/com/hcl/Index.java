package com.hcl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/Index"})
public class Index extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        
        out.println("<html><body><center><h1>Event Management System</h1>");
        out.println("<form action='Welcome' method='GET'>Event Name: <input type='text' name='eventName'><br>");
        out.println("<input type='submit' id='submit' value='Go'></form>");


        
        out.println("</center></body></html>");
        
        out.close();
    }

 

 

 

 

 

 

 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

 

 

 

 

 

 

 

}