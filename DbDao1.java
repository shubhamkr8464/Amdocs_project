package com.amdocs.dao;

import com.amdocs_entity.Doctor;

public interface DbDao1 {
		public boolean addtoDb(Doctor doctor);
		public boolean alterDb(int id, Doctor doctor);
		public boolean removefromDb(int id);
		public void viewSingleDb(int id);
		public void viewAllDb();
	}



