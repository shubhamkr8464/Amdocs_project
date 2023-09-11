package com.amdocs_entity;
import java.util.*;

import com.amdocs.dao.CustomerDao;
import com.amdocs.daoImpl.CustomerDaoImpl;


public class CustomerOptions {
	private Scanner sc;
	public void customerSelect() {
		sc = new Scanner(System.in);
		CustomerDao customerdao = new CustomerDaoImpl();
		System.out.println("Customer page");
		boolean flag = true;
		while(flag) {
			System.out.println("1.Register Customer");
			System.out.println("2.Modify Customer Details");
			System.out.println("3.Delete Customer Record");
			System.out.println("4.View Single Record");
			System.out.println("5.View All Records");
			System.out.println("0.Exit");
			int c = Integer.parseInt(sc.nextLine());
			switch(c) {
			case 1:
				customerdao.customerRegistration();
				break;
			case 2:
				customerdao.customerModification();
				break;
			case 3:
				customerdao.customerDeletion();
				break;
			case 4:
				customerdao.customerViewsingle();
				break;
			case 5:
				customerdao.customerViewAll();
				break;
			case 0:
				System.out.println("You returned ro the home page");
				flag=false;
				break;
				default:
					System.out.println("Wrong Choice, Try Again");
					break;
				
			}
		}
	}

}
