package com.amdocs.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.amdocs.DBConnection.DBConnection;
import com.amdocs.dao.DbDao;
import com.amdocs_entity.Customer;
public class DbDaoImp implements DbDao {
	private static Connection connection = DBConnection.getConnection();
	
	public boolean addtoDb(Customer customer) {
		try {
			String sql = "Insert into customer(first_name,second_name,phone_no,age) values (?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,customer.getFirst_name());
			ps.setString(2,customer.getSecond_name());
			ps.setString(3,customer.getPhone_no());
			ps.setString(4,customer.getAge());
			
			int executeUpdate = ps.executeUpdate();
			ps.close();
			if(executeUpdate>0) {
				return true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
		return false;
	}
	
	public boolean alterDb(int id, Customer customer) {
		String sql= "Update customer set first_name=?,second_name=?,phone_no=?,age=? where id=? ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,customer.getFirst_name());
			ps.setString(2,customer.getSecond_name());
			ps.setString(3,customer.getPhone_no());
			ps.setString(4,customer.getAge());
			
			int executeUpdate = ps.executeUpdate();
			ps.close();
			if(executeUpdate>0) {
				return true;
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		return false;
	}
	public boolean removefromDb(int id) {
		String sql = "DELETE FROM CUSTOMER WHERE ID =?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
				int executeUpdate = ps.executeUpdate();
				ps.close();
				if(executeUpdate>0) {
					return true;
				}
				
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				
			}
			return false;
			}
	public void viewSingleDb(int id) {
		String sql = "SELECT * FROM customer where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Customer id :" + rs.getInt("id"));
				System.out.println("First Name :" + rs.getString("first_name"));
				System.out.println("Second name:" + rs.getString("second_name"));
				System.out.println("Phone number" + rs.getString("phone_no"));
				System.out.println("Age" + rs.getString("age"));
				
			}
			rs.close();
			ps.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
				
	}
	public void viewAllDb() {
		String SQL ="Select * from Customer";
		try {
			PreparedStatement ps = connection.prepareStatement(SQL);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("Customer id :" + rs.getInt("id"));
			System.out.println("First Name :" + rs.getString("first_name"));
			System.out.println("Second name:" + rs.getString("second_name"));
			System.out.println("Phone number" + rs.getString("phone_no"));
			System.out.println("Age" + rs.getString("age"));
			
		}
		rs.close();
		ps.close();
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
			
		
	}
	
	

}
