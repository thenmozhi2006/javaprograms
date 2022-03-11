package org.programs;
//import java.util.Iterator;
public class Fibanosisseries {
		
	static int f1=0;
	static int f2=1;
	static int f3;
		
		public static void main(String[] args) {
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		for (int i = 0; i <10; i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			}
	}

}
