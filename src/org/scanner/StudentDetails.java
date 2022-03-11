package org.scanner;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter studentId");
		float studentId = s.nextFloat();
		System.out.println( studentId);
		
		System.out.println("Enter studentName");
		String studentName = s.next();
		System.out.println( studentName);
		
		System.out.println("Enter Mark1");
		int Mark1 = s.nextInt();
		System.out.println(  Mark1);
		
		System.out.println("Enter Mark2");
		int Mark2 = s.nextInt();
		System.out.println(  Mark2);
		
		System.out.println("Enter Mark3");
		int Mark3 = s.nextInt();
		System.out.println( Mark3);
		
		System.out.println("Enter Mark4");
		int Mark4 = s.nextInt();
		System.out.println( Mark4);
		
		System.out.println("Enter Mark5");
		int Mark5 = s.nextInt();
		System.out.println( Mark5);
		
		System.out.println("Toatl mark:"+(Mark1+Mark2+Mark3+Mark4+Mark5));
		
		System.out.println("Average mark :"+(Mark1+Mark2+Mark3+Mark4+Mark5)/5);
		
		
	}

	}


