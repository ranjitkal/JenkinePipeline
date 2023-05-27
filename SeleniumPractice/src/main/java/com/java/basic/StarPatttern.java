package com.java.basic;

public class StarPatttern {

public static void main(String[] args) {
	
	
	System.out.println("star Pattern");
	int no=5;
	Character alpa=65;
	
	for (int i = 0; i < no; i++) {
		
		
		for (int j = no; j > i; j--) {
			
			System.out.print(" ");
		}
		for (int k = 0; k <i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
