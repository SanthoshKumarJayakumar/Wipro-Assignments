package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB09 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		StringBuffer sb=new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='*'){
				sb.deleteCharAt(i-1);
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb);
	}

}
