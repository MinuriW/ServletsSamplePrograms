package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;

@WebServlet("/AddServ")
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	    String[] items=request.getParameterValues("items");
	    HttpSession session=request.getSession();
	    List<Integer> cart=null;
	    
	    cart=(List<Integer>)session.getAttribute("cart");
	    
		if(cart==null)
		{
			cart=new ArrayList<>();
		}
		
			for(String k:items) {
			cart.add(Integer.parseInt(k));
			}
			
			session.setAttribute("cart", cart);
			out.println("<html><body><font color='green'>"+items.length+" Iems have been  added in cart successfully.</font>");
			out.println("<div align='right'> <font color='red'>Items in cart:"+cart.size()+"</font>&nbsp;&nbsp;<a href='checkout'>Checkout</a>");
            request.getRequestDispatcher("index.html").include(request,response);
            
            out.close();
			
		}
	}

	

