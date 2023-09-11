package com.amdocs.dao;
import com.amdocs_entity.Customer;
public interface DbDao {
	public boolean addtoDb(Customer customer);
	public boolean alterDb(int id, Customer customer);
	public boolean removefromDb(int id);
	public void viewSingleDb(int id);
	public void viewAllDb();
}
