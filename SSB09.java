package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB09 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		StringBuffer sb=new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='*' && s.charAt(i+1)=='*'){
				sb.deleteCharAt(i+1);
				sb.deleteCharAt(i-1);
				sb.deleteCharAt(i);
				sb.deleteCharAt(i-1);
				break;
			}
			else if(s.charAt(i)=='*') {
				sb.deleteCharAt(i);
				sb.deleteCharAt(i-1);
				sb.deleteCharAt(i-1);
			}
		}
		System.out.println(sb);
	}

}
