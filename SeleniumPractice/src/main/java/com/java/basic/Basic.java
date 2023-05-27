package com.java.basic;

public class Basic {
	
	
	public static void main(String[] args) {
		
		String abc="RanjitKalgavkar";
		char ab[]=abc.toCharArray();
		StringBuffer sb=new StringBuffer();
		sb.append(abc);
		for (int i = 0; i < sb.length(); i++) {
			
			for (int j = i+1; j < sb.length(); j++) {
				
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
				}
			}
			System.out.print(sb.charAt(i));
			System.out.println();
		}
		
		for (int k = ab.length-1; k >0; k--) {
			
			System.out.print(ab[k]);
		}
		
		
		
		
	} 

}
