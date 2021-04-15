package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/create")
public class PageGeneratorServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String cat=request.getParameter("cat");
		ProductDAO dao=new ProductDAO();
		List<Product> list=dao.getProductsByCategory(cat);
		
		out.println("<html><body><center><h1>Shopping Cart App</h1></hr>");
		out.println("<h2>"+cat+"</h2>");
		out.println("<table>");
	    out.println("<form action='AddServ' method='get'>");
	    for(Product p:list) {
	     out.println("<tr><td><input type='checkbox' name='items' value='"+p.getProductId()+"'></td><td>"+p.getPname()+"</td><td>"+p.getPrice()+"</td></tr>");
	    
	    }
	    out.println("<tr><td colspan='3' align='center'><input type='submit' value='Add to Cart'></td></tr>");
       out.println("</form></table><br>");
       out.println("<a href='index.html'>Home</a>");
       out.println("</center></body></html>");
       
		
		
	}

	
}
