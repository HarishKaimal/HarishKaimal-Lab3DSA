package com.gl.labs3dsa;
import java.util.Scanner;

class DriverClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string of braces you'd like to check");
		String str_check = sc.next();
		
		BalancedBraces bb = new BalancedBraces();
		if (bb.checkBalancedBraces(str_check))
			System.out.println("The entered String has Balanced Brackets");
		else	
			System.out.println("The entered String do not contain Balanced Brackets");
		
		sc.close();
	}
}
