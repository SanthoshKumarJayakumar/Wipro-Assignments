package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB11 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		System.out.println("Enter how many times the string should repeat");
		int n=d.nextInt();
		if(n<=s.length() || n>0){
			for (int i = 0; i < n; i++) {
				String s1=s.substring(s.length()-n,s.length());
				System.out.print(s1);
			}
		}
	}
}
