package com.amdocs_entity;

import java.util.Scanner;

public class CustomerManipulation {
	private Scanner sc = new Scanner(System.in);
	Customer customer;
	public Customer takeInput() {
		customer = new Customer();
	    System.out.println("Enter your First_Name");
	    String first_name = sc.nextLine();
	    customer.setFirst_name(first_name);
	    
	    System.out.println("Enter the Second_name");
	    String second_name = sc.nextLine();
	    customer.setSecond_name(second_name);
	    
	    System.out.println("Enter the Phone_number");
	    String phone_no = sc.nextLine();
	    customer.setPhone_no(phone_no);
	    
	    System.out.println("Enter your Age");
	    String age = sc.nextLine();
	    customer.setAge(age);
	    
	    
	    return customer;
	}
	public int takeId() {
		System.out.println("Enter your Id");
		int id= Integer.parseInt(sc.nextLine());
		
		return id;
	}
	
}

