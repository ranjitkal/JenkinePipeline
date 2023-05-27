package com.java.basic;

public class RemoveCharcter {
	
	public static void main(String[] args) {
		
		
		System.out.println("remove duplicate charcter");
		String given="ranjitranjit";
		//char ab[]=given.toCharArray();
		System.out.println("givenstring ---------"+given);
		//StringBuilder sb=new StringBuilder(given);
		StringBuffer str=new StringBuffer();
		str.append(given);
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j))
				{
					str.deleteCharAt(j);
				}
				
			}
			
		}
		System.out.println("After deletion-----------"+str);
		
	}

}
