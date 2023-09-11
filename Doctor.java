package com.amdocs_entity;

public class Doctor {
	int id;
	String firstname;
	String lastname;
	String Specialist;
	String Fees;
	String Apointment_time;
	String Years;
	
	public String getYears() {
		return Years;
	}
	public void setYears(String years) {
		this.Years = years;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSpecialist() {
		return Specialist;
	}
	public void setSpecialist(String specialist) {
		Specialist = specialist;
	}
	public String getFees() {
		return Fees;
	}
	public void setFees(String fees) {
		Fees = fees;
	}
	public String getApointment_time() {
		return Apointment_time;
	}
	public void setApointment_time(String apointment_time) {
		Apointment_time = apointment_time;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", Specialist=" + Specialist
				+ ", Fees=" + Fees + ", Apointment_time=" + Apointment_time + ", Years=" + Years + "]";
	}
	
	}
	
	
	


