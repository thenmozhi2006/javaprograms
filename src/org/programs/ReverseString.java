package org.programs;

public class ReverseString {
	public static void main(String[] args) {
		String s= "tHENMOZHI";
		String rev="";
		int length = s.length();
		for (int i = length-1; i >=0; i--) {
			char C = s.charAt(i);
			rev=rev+C;
		}
		System.out.println(rev);
	}

}
