package com.amdocs.daoImpl;

import com.amdocs.dao.DoctorDao;
import com.amdocs.dao.DbDao1;
import com.amdocs_entity.Doctor;
import com.amdocs_entity.DoctorManipulation;
public class DoctorDaoImpl implements DoctorDao{
	 DbDao1 dbdao1 = new DbDaoImp1();

	@Override
	public void doctorAdmission() {
		// TODO Auto-generated method stub
		DoctorManipulation doctorinput= new DoctorManipulation();
		Doctor doctor = doctorinput.takeInput();
		boolean check = dbdao1.addtoDb(doctor);
		if(check == true) {
			System.out.println("Insertion done");
		}
		else {
			System.out.println("failed Insertion process");
		}
		
	}

	@Override
	public void doctorModification() {
		// TODO Auto-generated method stub
		DoctorManipulation doctorinput= new DoctorManipulation();
		int id = doctorinput.takeId();
		Doctor doctor = doctorinput.takeInput();
		
		boolean check = dbdao1.alterDb(id, doctor);
		if(check == true) {
			System.out.println("Modification done");
		}
		else {
			System.out.println("Failed to Modify");
		}
	}

	@Override
	public void doctorDeletion() {
		// TODO Auto-generated method stub
		DoctorManipulation doctorinput= new DoctorManipulation();
		int id = doctorinput.takeId();
		boolean check = dbdao1.removefromDb(id);
		if(check == true) {
			System.out.println("Deletion done");
		}
		else {
			System.out.println("Failed to Delete");
		}
	}

	@Override
	public void doctorViewsingle() {
		// TODO Auto-generated method stub
		DoctorManipulation doctorinput= new DoctorManipulation();
		int id = doctorinput.takeId();
		dbdao1.viewSingleDb(id);
	}

	@Override
	public void doctorViewAll() {
		// TODO Auto-generated method stub
		dbdao1.viewAllDb();
	}
	 
	}
