package com.Epam.Junit;

public class RemoveFirstTwoAs {
	public String RemoveA(String string){
		String str = "";
		//string = "ABCD";
		int n = string.length();
		for(int i =0;i < 2;i++){
			if(string.charAt(i) != 'A'){
				str += string.charAt(i);
			}
		}
		System.out.println(str + string.substring(2, n));
		return (str + string.substring(2, n));
	}

}
