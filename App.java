package com.amdocs;
import java.util.*;

import com.amdocs_entity.CustomerOptions;
import com.amdocs_entity.DoctorOptions;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        while(true) {
        	System.out.println("\n 1.Customer");
        	System.out.println("\n 2.Doctor");
        	System.out.println("\n 3.Exit");
        	int c = Integer.parseInt(sc.nextLine());
        	switch(c) {
        	case 1:
        		moveToCustomer();
        		break;
        	case 2:
        		moveToDoctor();
        		break;
        	case 0:
        		System.out.println("ThanK YOU, Vist Again");
        		System.exit(0);
        		break;
        	
        	default:
        		System.out.println("Wrong Selection, You can try again");
        		break;
        	}
        	}
    }
    private static void moveToCustomer() {
    	CustomerOptions customeroptions = new 	CustomerOptions();
    	customeroptions.customerSelect();
    }
    private static void moveToDoctor() {
    	DoctorOptions doctoroptions = new DoctorOptions();
    	doctoroptions.DoctorSelect();
    }
}
