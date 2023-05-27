package com.java.basic;

public class Example {
	
	
	public static void main(String[] args) {
		System.out.println("Practice porpose");
		String given="ranjit deepak kalgavakar";
		String xy="ranjitanjit";
		StringBuffer sb=new StringBuffer();
		sb.append(xy);
		
	
		char ab[]=xy.toCharArray();
		int count=0;
		for (int m = 0; m < ab.length; m++) {
			
			char c=xy.charAt(m);
			for (int n = 0; n < ab.length; n++) {
				if(c==ab[n])
				{
					count++;
					ab[n]='\u0000';
				}
			}
			System.out.print(c+"count="+count);
		}
		
		
		
		
		
		
		for (int x = 0; x < sb.length(); x++) {
			
			for (int y = x+1; y < sb.length(); y++) {
				
				if(sb.charAt(x)==sb.charAt(y))
				{
					
					sb.deleteCharAt(y);
				}
			}

		}
		
		System.out.println("reverse ----------"+sb);
		
		String givensplit[]=given.split(" ");
		//char ab[]=given.toCharArray();
		for (int k = ab.length-1; k >0; k--) {
			System.out.print(ab[k]);
		}
		
		
		
		System.out.println();
		String reversestring="";
		for (int i = 0; i <= givensplit.length-1; i++) {
			
			String abc=givensplit[i];
			String revrewd="";
			for (int j = abc.length()-1; j >= 0; j--) {
				
				revrewd=revrewd+abc.charAt(j);
			}
			
			reversestring=reversestring+revrewd+"  ";
		}
		System.out.println(reversestring);
		
		
	}

}
