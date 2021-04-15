package com.hcl;
import java.util.*;
import java.sql.*;

public class ProductDAO {

	
	public ProductDAO() {
			}
	public List<Product> getProductsByCategory(String cat){
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pmt=null;
		ResultSet rs=null;
		String query=null;
		List<Product> list=null;
		
		try
		{
			query="select * from product where category=?";
			pmt=con.prepareStatement(query);
			pmt.setString(1, cat);
			rs=pmt.executeQuery();
			list=new ArrayList<>();
			while(rs.next()) {
				list.add(new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4)));
			}
			
		}
		catch(SQLException se) {se.printStackTrace();}
		
		return list;
		
	}//getProductBy Cat..
	
	
	public Product searchProductById(int id)
	{
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pmt=null;
		String query="select * from product where productId=?";
		ResultSet rs=null;
		Product  p=null;
		try {
			pmt=con.prepareStatement(query);
			pmt.setInt(1, id);
			rs=pmt.executeQuery();
			if(rs.next())
			{
				p=new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4));
			}
		}//try
		catch(SQLException se) {se.printStackTrace();}
		
		return p;
	}
	
		
	

}//class
