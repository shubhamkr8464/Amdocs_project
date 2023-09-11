package com.amdocs_entity;

import java.util.Scanner;

public class DoctorManipulation {
	private Scanner sc = new Scanner(System.in);
	Doctor doctor;
	public Doctor takeInput() {
		doctor = new Doctor();
	    System.out.println("Enter your First_Name");
	    String firstname = sc.nextLine();
	    doctor.setFirstname(firstname);
	    
	    System.out.println("Enter the Second_name");
	    String lastname = sc.nextLine();
	    doctor.setLastname(lastname);
	    
	    System.out.println("Specialist");
	    String specialist = sc.nextLine();
	    doctor.setSpecialist(specialist);
	    
	    System.out.println("Doctor Fees");
	    String fees = sc.nextLine();
	    doctor.setFees(fees);
	    
	    System.out.println("Time of Doctor");
	    String apointment_time = sc.nextLine();
	    doctor.setFees(apointment_time);
	    
	    System.out.println("Years of Experience");
	    String 	years = sc.nextLine();
	    doctor.setYears(years);
	    
	    return doctor;
	}
	public int takeId() {
		System.out.println("Enter your Id");
		int id= Integer.parseInt(sc.nextLine());
		
		return id;
	}
	
}

