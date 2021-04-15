package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/checkout")
public class CheckoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	    HttpSession session=request.getSession(false);
	    List<Integer> cart=null;
	    if(session!=null)
	    cart=(List<Integer>)session.getAttribute("cart");
		out.println("<html><body><center>");
		if(cart==null|| cart.size()==0)
		{
	      out.println("<font color='red'><B>There is no item in cart. Please add items</B></font>");
	      request.getRequestDispatcher("index.html").include(request, response);
		}//if
		else
		{
	     ProductDAO dao=new ProductDAO();		
	     out.println("<h1>Shopping Cart App</h1><hr color='tomato' size='5'>");
	     out.println("<h2>Invoice</h2>");
	     double total=0;
	     int i=1;
	     out.println("<table border='1' cellspacing='2' cellpadding='2'><tr><th>SNO</SNO><th>Product</th><th>Price</th></tr>");
	     
	     for(Integer k:cart)
	     {
	    	 Product p=dao.searchProductById(k);
	    	 total+=p.getPrice();
	    	 out.println("<tr><td>"+i+"</td><td>"+p.getPname()+"</td><td>"+p.getPrice()+"</td></tr>");
	    	 i++;
	     }
	     out.println("<tr><td colspan='2'>Total Amount(INR)</td><td>"+total+"</td></tr>");
	     out.println("</table>");
	     session.invalidate();
	     out.println("<BR><a href='index.html'>Continue Shopping</a>");
	    
		}//else
			
		out.println("</center></body></html>");   
            out.close();
			
		
		
	}



}
