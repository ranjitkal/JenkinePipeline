package com.java.basic;

public class RverseEachWord {

	public static void main(String[] args) {
		
		String name="Ranjit Deepak Kalgavkar";
		String namesplit[]=name.split(" ");
		String reversestring="";
		for (int i = 0; i < namesplit.length; i++) {
			
			String abc=namesplit[i];
			String reverword="";
			for (int j = abc.length()-1; j > 0; j--) {
				
				reverword=reverword+abc.charAt(j);
			}
		   reversestring=reversestring+reverword+" ";
		}
		System.out.println(reversestring);
	}
}
