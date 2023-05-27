package com.java.basic;

public class RemoveWhiteSpace {

	
	public static void main(String[] args) {
		String abc="  ranjit vihaan Omii ";
		String ab="ranjitomiii";
		char a[]=ab.toCharArray();
		System.out.println(abc.replaceAll("\\s", ""));
	    System.out.println(abc.trim());
	    System.out.println(ab.substring(1,ab.length()-6));
	    System.out.println("progra  reverse each word in string");
	    String givenstring="Ranjit Deepak Kalgavkar";
	    String reverseString="";
	    String givenarray[]=givenstring.split(" ");
	    for (int i = 0; i < givenarray.length; i++) {
			
	    	String given=givenarray[i];
	    	String reverseword="";
	    	for (int j = given.length()-1; j >=0; j--) {
	    		
	    		reverseword=reverseword+given.charAt(j);
				
			}
	    	reverseString=reverseString+reverseword+" ";
	    	
		}
	    
	    System.out.println(reverseString);
	    
	    
	}
}
