package com.amdocs_entity;
import java.util.*;
import com.amdocs.dao.DoctorDao;
import com.amdocs.daoImpl.DoctorDaoImpl;



public class DoctorOptions {
	private Scanner sc;
	public void DoctorSelect() {
		sc = new Scanner(System.in);
		DoctorDao doctordao = new DoctorDaoImpl();
		System.out.println("Customer page");
		boolean flag = true;
		while(flag) {
			System.out.println("1.Doctor admission in the hospital");
			System.out.println("2.Modify Doctor Details");
			System.out.println("3.Delete Doctor Record");
			System.out.println("4.View Single Record");
			System.out.println("5.View All Records");
			System.out.println("0.Exit");
			int c = Integer.parseInt(sc.nextLine());
			switch(c) {
			case 1:
				doctordao.doctorAdmission();
				break;
			case 2:
				doctordao.doctorModification();
				break;
			case 3:
				doctordao.doctorDeletion();
				break;
			case 4:
				doctordao.doctorViewsingle();
				break;
			case 5:
				doctordao.doctorViewAll();
				break;
			case 0:
				System.out.println("You returned to the home page");
				flag=false;
				break;
				default:
					System.out.println("Wrong Choice, Try Again");
					break;
				
			}
		}
	}

}
