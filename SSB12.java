package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB12 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=d.nextLine();
		System.out.println("Enter the String to check");
		String s2=d.nextLine();
		int slen = s1.length();
		int wlen = s2.length();
		String fin = "";
		for (int i = 0; i < slen-wlen+1; i++) {
			String tmp = s1.substring(i,i+wlen);
			if (i > 0 && tmp.equals(s2)){
				fin += s1.substring(i-1,i);
			}
			if (i < slen-wlen && tmp.equals(s2)){
				fin += s1.substring(i+wlen,i+wlen+1);
			}
		}
		System.out.println(fin);
	}
}

