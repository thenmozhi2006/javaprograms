package org.programs;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = s.next();
		
		char a[]=name.toCharArray();
		int space1=name.length();
		int count1=1;
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <count1; k++) {
				System.out.print(a[k]+" ");	
			}
			space1--;
			count1++;
			System.out.println();
		}
		int space2=1;
		int count2=name.length();
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= space2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <count2; k++) {
				System.out.print(a[k]+" ");	
			}
			space2--;
			count2++;
			System.out.println();
	}

}}
