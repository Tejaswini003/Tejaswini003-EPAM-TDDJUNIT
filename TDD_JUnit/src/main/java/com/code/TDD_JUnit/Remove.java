package com.code.TDD_JUnit;

public class Remove
{

	public static String manipulate(String string) {
		int length=string.length();
		String result="";
		if(string=="A" || string=="AA" || string=="")
			return result;
	
		else if(string.charAt(0)=='A' && string.charAt(1)!='A')
		{
			result=string.substring(1,length);
		}
		else if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			result=string.substring(2,length);
		}
		else if(string.charAt(0)!='A' && string.charAt(1)=='A')
		{
			result=string.charAt(0)+string.substring(2,length);
		}
		else 
			result =string;
		return result;
	}

}
