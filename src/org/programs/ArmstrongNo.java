package org.programs;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		int n=153; 
		int a=0; 
		int temp=0;
		int ans=0;
		
		temp =n;
		while (n>0) {
		a=	n%10;
		ans= ans+(a*a*a);
		n=n/10;
	}
		if (ans==temp) {
			System.out.println("Armstrong Number:"+ans);
	}
		else {
			System.out.println("Not Armstrong Number:"+ans);
	}
	

}}
