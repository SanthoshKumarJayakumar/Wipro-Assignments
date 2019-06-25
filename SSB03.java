package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

import javax.swing.Spring;

public class SSB03 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		System.out.println("Enter how many times the string should repeat");
		int n=d.nextInt();
		if(s.length()>=2){
			for (int i = 0; i < n; i++) {
				String s1=s.substring(0,2);
				System.out.print(s1);
			}
		}
		else if (s.length()<2){
			for (int i = 0; i < n; i++) {
				System.out.print(s);
			}
		}

	}

}
