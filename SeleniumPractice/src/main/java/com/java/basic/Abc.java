package com.java.basic;

public class Abc {

	public static void main(String[] args) {
		
		System.out.println("star program");
		int no=6;
      for (int i = 1; i < no; i++) {
		
    	  for (int j =no-1; j >= i; j--) {
			System.out.print(" ");
		}
    	  for (int k = 1; k <=i; k++) {
			System.out.print("*"+" ");
		}
    	  System.out.println();
	}
		
		
		
	}
	
}