package com.gl.labs3dsa;

class BalancedBraces {

	char[] Braces  = new char[] {'[','{','(',']','}',')'};
	
	boolean checkBalancedBraces(String str) {
		
		System.out.println(" The entered String is " + str);
		char[] char_stack = new char[str.length()];
		
		int top = 0;
		
		if ((str.length())%2 !=0 ) {
			return false;
		}
		
		for (int i=0; i < str.length(); i++) {
			
			if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
				char_stack[top]=str.charAt(i);
				top++;
			}
			
			else {
				
				if (str.charAt(i) == ']' && char_stack[top-1] == '[') {
					top--;
				}	
				else if (str.charAt(i) == '}' && char_stack[top-1] == '{') {
					top--;
				}
				else if (str.charAt(i) == ')' && char_stack[top-1] == '(') {
					top--;
				}
				else
					return false;
			}
		}
		return true;
	}
	
}
