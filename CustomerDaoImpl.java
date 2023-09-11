package com.amdocs.daoImpl;

import com.amdocs.dao.CustomerDao;
import com.amdocs_entity.Customer;
import com.amdocs_entity.CustomerManipulation;
import com.amdocs.dao.DbDao;


public class CustomerDaoImpl implements CustomerDao{
 DbDao dbdao = new 	DbDaoImp();

@Override
public void customerRegistration() {
	// TODO Auto-generated method stub
	CustomerManipulation customerinput= new CustomerManipulation();
	Customer customer = customerinput.takeInput();
	boolean check = dbdao.addtoDb(customer);
	if(check == true) {
		System.out.println("Insertion done");
	}
	else {
		System.out.println("failed Insertion process");
	}
	
}

@Override
public void customerModification() {
	// TODO Auto-generated method stub
	CustomerManipulation customerinput= new CustomerManipulation();
	int id = customerinput.takeId();
	Customer customer = customerinput.takeInput();
	
	boolean check = dbdao.alterDb(id, customer);
	if(check == true) {
		System.out.println("Modification done");
	}
	else {
		System.out.println("Failed to Modify");
	}
}

@Override
public void customerDeletion() {
	// TODO Auto-generated method stub
	CustomerManipulation customerinput= new CustomerManipulation();
	int id = customerinput.takeId();
	boolean check = dbdao.removefromDb(id);
	if(check == true) {
		System.out.println("Deletion done");
	}
	else {
		System.out.println("Failed to Delete");
	}
}

@Override
public void customerViewsingle() {
	// TODO Auto-generated method stub
	CustomerManipulation customerinput= new CustomerManipulation();
	int id = customerinput.takeId();
	dbdao.viewSingleDb(id);
}

@Override
public void customerViewAll() {
	// TODO Auto-generated method stub
	dbdao.viewAllDb();
}
 
}
