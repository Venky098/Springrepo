package com.myApplication.Service;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.myApplication.Customer.JDBCdetails;
import com.myApplication.Entity.Customerdata;

public class CustomerServiceImpl implements CustomerService{
	
	public String createCustomer(Customerdata c) {
			JDBCdetails  jdbc = new JDBCdetails();
			String sql = "insert into customer_data values(?,?,?)";
			PreparedStatement pr= null;
			Connection con =null;
			try {
				Class.forName(jdbc.getDriver());
				con= DriverManager.getConnection(jdbc.getUrl(), jdbc.getUsername(),jdbc.getPassword());
				pr = con.prepareStatement(sql);
				System.out.println(" Statement is success");
			
				pr.setInt(1,c.getCustomer_id());
				System.out.println(" Statement is success"+c.getCustomer_id());
				pr.setString(2, c.getCustomer_name());
				System.out.println(" Statement is success"+c.getCustomer_name());
				pr.setString(3, c.getCustomer_region());
				System.out.println(" Statement is success"+sql);
				pr.executeUpdate();
				System.out.println(" insertion is success");
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				
				try {
					pr.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		
		
		
		return "";
	}

}
