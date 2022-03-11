package org.programs;

public class T_arm{
	
	public static void main(String[] args) {
		//int n=153; 
		int a=0; 
		int temp=0;
		int ans=0;
		//int  i;
		
		for (int i = 1; i <= 1000; i++) {
			temp =i;
			while (i>0) {
			a=	i%10;
			ans= ans+(a*a*a);
			i=i/10;
			}
		
			if (ans==temp) {
				System.out.println("Armstrong Number:"+ans);
		}
			else {
				System.out.println("Not Armstrong Number:"+ans);
		}
	}	
}
}