package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB10 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=d.nextLine();
		System.out.println("Enter the String");
		String s2=d.nextLine();
		StringBuffer sb=new StringBuffer();
		int n;
		String sub = "";
		if(s1.length()>s2.length()){
			n=s1.length()-s2.length();
			sub=s1.substring(s2.length(), s2.length()+n);
		}
		else if (s1.length()<s2.length()){
			n=s2.length()-s1.length();
			sub=s2.substring(s1.length(), s1.length()+n);
		}
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}
		System.out.println(sb+sub);
	}

}
