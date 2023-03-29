package com.java.basic;

import java.util.Scanner;

public class ArmstrongNumber {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Plaindrome Poram");
		int no=sc.nextInt();
		System.out.println("----no="+no);
		//int no=162;
		int temp=no,rem,rev = 0;
		while(no>0)
		{
			rem=no%10;
			rev=rev+(rem*rem*rem);
			no=no/10;
		}
		
		if(temp==rev)
		{
			System.out.println("armstrong");
		}else
		{
			System.out.println("not armstrong");
		}
		
	}
}
