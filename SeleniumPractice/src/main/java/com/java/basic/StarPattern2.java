package com.java.basic;

public class StarPattern2 {

	
	public static void main(String[] args) {
		
		System.out.println("Star Pogram");
		int no=6;
		for (int i = 1; i < no; i++) {
			
			for (int j = no-1; j >=i; j--) {
				
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("New Program");
		int given=371,rem,rev = 0;
		int temp=given;
		while(given>0)
		{
			rem=given%10;
			rev=rev+(rem*rem*rem);
			given=given/10;
			
		}
		if (temp==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("no palindrome");
		}
		
		System.out.println("String program");
		String givenString="Ranjit Deepak Kalgavkar";
		String splitString[]=givenString.split(" ");
		String reverseword="";
		for (int a = 0; a <= splitString.length-1; a++) {
			
			String reverseString="";
			String abc=splitString[a];
			for (int b = abc.length()-1; b >=0; b--) {
				
				reverseword=reverseword+abc.charAt(b);
			}
			
			reverseString=reverseString+reverseword+"    ";
			System.out.println("revrsestring-------"+reverseString);

		}
		

		
		
		
		
	}
}
