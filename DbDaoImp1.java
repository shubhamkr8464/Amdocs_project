package com.amdocs.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.amdocs.DBConnection.DBConnection;
import com.amdocs.dao.DbDao1;

import com.amdocs_entity.Doctor;
public class DbDaoImp1 implements DbDao1 {
	private static Connection connection = DBConnection.getConnection();
	
	public boolean addtoDb(Doctor doctor) {
		try {
			String sql = "Insert into doctor(firstname,lastname,specialist,fees,apointment_time,years) values (?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,doctor.getFirstname());
			ps.setString(2,doctor.getLastname());
			ps.setString(3,doctor.getSpecialist());
			ps.setString(4,doctor.getFees());
			ps.setString(5,doctor.getApointment_time());
			ps.setString(6,doctor.getYears());
			
			
			
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
	
	public boolean alterDb(int id, Doctor doctor) {
		String sql= "Update doctor set firstname=?,lastname=?,specialist=?,fees=?,apointment_time=?,years=? where id=? ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1,doctor.getFirstname());
			ps.setString(2,doctor.getLastname());
			ps.setString(3,doctor.getSpecialist());
			ps.setString(4,doctor.getFees());
			ps.setString(5,doctor.getApointment_time());
			ps.setString(6,doctor.getYears());
			
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
		String sql = "DELETE FROM doctor WHERE ID =?";
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
		String sql = "SELECT * FROM doctor where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Doctor id :" + rs.getInt("id"));
				System.out.println("First Name :" + rs.getString("firstname"));
				System.out.println("Last name :" + rs.getString("lastname"));
				System.out.println("Specialist :" + rs.getString("specialist"));
				System.out.println("Fees : " + rs.getString("fees"));
				System.out.println("Apointment_Time : " + rs.getString("apointment_time"));
				System.out.println("Years : " + rs.getString("years"));
				
			}
			rs.close();
			ps.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
				
	}
	public void viewAllDb() {
		String SQL ="Select * from doctor";
		try {
			PreparedStatement ps = connection.prepareStatement(SQL);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("Doctor id : " + rs.getInt("id"));
			System.out.println("First Name : " + rs.getString("firstname"));
			System.out.println("Last name : " + rs.getString("lastname"));
			System.out.println("Specialist : " + rs.getString("specialist"));
			System.out.println("Fees : " + rs.getString("fees"));
			System.out.println("Apointment_time :" + rs.getString("apointment_time"));
			System.out.println("Years :" + rs.getString("years"));
		}
		rs.close();
		ps.close();
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
			
		
	}
	
	

}
