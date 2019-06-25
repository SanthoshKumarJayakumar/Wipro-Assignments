package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		System.out.println("Enter the String Separator");
		String sep=d.nextLine();
		System.out.println("Enter how many times the string should repeat");
		int n=d.nextInt();
		StringBuffer sb=new StringBuffer(s);
		for (int i = 0; i < n; i++) {
			sb.append(s);
			sb.append(sep);
		}
		sb.delete(0, s.length());
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}
