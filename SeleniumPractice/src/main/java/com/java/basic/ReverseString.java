package com.java.basic;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		System.out.println("rverse String");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String givernstring=sc.next();
		System.out.println("given string-------"+givernstring);
		char result[]=givernstring.toCharArray();
		for (int i = result.length-1; i > 0; i--) {
			System.out.print(result[i]);
		}
	}
}
