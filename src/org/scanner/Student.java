package org.scanner;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner  e = new Scanner(System.in); 
		
		System.out.println("enter studentId");
		float id = e.nextFloat();
		System.out.println(id);
		
		System.out.println("enter studentName");
		String Name = e. next();
		System.out.println(Name);
		
		System.out.println("enter studentEmail");
		String Email = e. next();
		System.out.println(Email);
		
		System.out.println("enter studentPhoneno");
		int Phoneno = e.nextInt();
		System.out.println(Phoneno);
		
		System.out.println("enter studentDept");
		String Dept= e.next();
		System.out.println(Dept);
		
		System.out.println("enter studentGender");
		String Gender = e. next();
		System.out.println(Gender);
		
		System.out.println("enter studentCity");
		String City = e. next();
		System.out.println(City);
		
	}




}
