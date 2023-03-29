package com.java.basic;

import java.util.Iterator;
import java.util.Scanner;

public class Fake {


	public static void main(String[] args) {
		
		String givenstring="Ranjit Deepak kalgavkar";
		String abc[]=givenstring.split(" ");
		String ReverseString="";
		for (int i = 0; i < abc.length-1; i++) {
			
			String ab=abc[i];
			String reverseword="";
			for (int j = ab.length()-1; j >0; j--) {
				reverseword=reverseword+ab.charAt(j);
				
			}
			ReverseString=ReverseString+reverseword+" ";
			System.out.print(ReverseString);
			
		}
		
	}}
		/*
		
		
		String abc="ranjit";
		char ab[]=abc.toCharArray();
		for (int s = ab.length-1; s >=0; s--) {
			System.out.print(ab[s]);
		}
		
		
		
		
		
		System.out.println("simple ava program");
	Scanner ssc=new Scanner(System.in);
	int rem,rev = 0;
	System.out.println("enter no");
	int no=ssc.nextInt();
	int temp=no;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(temp==rev)
		{
			System.out.println("yes");
		}else
		{
			System.out.println("not");
		}
		
		
		
	}
		
}
*/