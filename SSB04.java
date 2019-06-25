package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB04 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=d.nextLine();
		if(s.length()%2==0){
			String s1=s.substring(0, s.length()/2);
			System.out.println("First Half-->"+s1);
		}
		else{
			System.out.println("null");
		}
	}

}
