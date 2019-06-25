package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB07 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		if(s.charAt(0)==('x') && s.charAt(s.length()-1)==('x')){
			System.out.println(s.substring(1, s.length()-1));
		}
		else if(s.charAt(0)==('x') || s.charAt(s.length()-1)==('x')){
			if(s.charAt(0)==('x')){
			System.out.println(s.substring(1, s.length()));
			}
			if(s.charAt(s.length()-1)==('x')){
				System.out.println(s.substring(0, s.length()-1));
			}
		}
		
	}
}
