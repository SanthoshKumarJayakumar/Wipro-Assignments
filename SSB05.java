package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		if(s.length()>=2){
			String s1=s.substring(1, s.length()-1);
			System.out.println(s1);
		}
	}

}
