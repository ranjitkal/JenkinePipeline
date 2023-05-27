package com.java.basic;

import java.util.HashMap;
import java.util.Map;

public class CountCharct {
  public static void main(String[] args) {
	
	  System.out.println("count charcter");
	  String abc="ranjitranjit";
	  System.out.println("givenstring----------------"+abc);
	  StringBuffer sb=new StringBuffer();
	  sb.append(abc);
	  for (int i = 0; i < sb.length(); i++) {
		
		  for (int j = i+1; j < sb.length(); j++) {
			
			  if(sb.charAt(i)==sb.charAt(j));
			  {
				  sb.deleteCharAt(j);
			  }
		}
	}
	  System.out.println("after remove------"+sb);

	  
	  char ab[]=abc.toCharArray();
	  Map<Character,Integer> map=new HashMap();
	  for (char c : ab) {
		if(!map.containsKey(c))
		{
			map.put(c,1);
		}else
		{
			int value=map.get(c);
			map.put(c, value+1);
		}
	}
	  System.out.println(map);
}
}
