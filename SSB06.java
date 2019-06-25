package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1=d.nextLine();
		System.out.println("Enter the 2nd String");
		String s2=d.nextLine();
		if(s1.length()>s2.length() && s1.length()!=s2.length()){
			System.out.println(s2+s1+s2);
		}
	}

}
