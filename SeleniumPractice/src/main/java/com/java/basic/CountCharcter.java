package com.java.basic;

import java.util.Scanner;

public class CountCharcter {
public static void main(String[] args) {
	
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter String");
	String abc=Sc.next();
	System.out.println(abc);
	
	char ab[]=abc.toCharArray();
	for (int i = 0; i < ab.length; i++) {
		
		char c=abc.charAt(i);
		int count=0;
		for (int j = 0; j < ab.length; j++) {
			
			if(c==ab[j])
			{
				count++;
		//	ab[j]='\u0000';
				
			}}
			if(count>0)
				System.out.println(c+"--------"+count);
		}
		
	}
	
}


