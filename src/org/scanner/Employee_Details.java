package org.scanner;

import java.util.Scanner;

public class Employee_Details {
	
	public static void main(String[] args) {
		Scanner  e = new Scanner(System.in); 
		
		System.out.println("enter empId");
		float id = e. nextFloat();
		System.out.println(id);
		
		System.out.println("enter empName");
		String Name = e. next();
		System.out.println(Name);
		
		System.out.println("enter empEmail");
		String Email = e. next();
		System.out.println(Email);
		
		System.out.println("enter empPhoneno");
		long Phoneno = e. nextLong();
		System.out.println(Phoneno);
		
		System.out.println("enter empSalary");
		int Salary= e. nextInt();
		System.out.println(Salary);
		
		System.out.println("enter empGender");
		String Gender = e. next();
		System.out.println(Gender);
		
		System.out.println("enter empCity");
		String City = e. next();
		System.out.println(City);
		
	}

}
