package Milestone1_OOPSInheritance_StringAndStringBuffer;

import java.util.Scanner;

public class SSB02 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1=d.nextLine().toLowerCase();
		System.out.println("Enter the 2nd String");
		String s2=d.nextLine().toLowerCase();
		StringBuffer sb=new StringBuffer(s1);
		if(s1.charAt(s1.length()-1)==(s2.charAt(0))){
			sb.delete(sb.length()-1,sb.length());
			sb.append(s2);
			System.out.println("\nString after concatenation is "+sb);
		}
		else{
			sb.append(s2);
			System.out.println("\nString after concatenation is "+sb);
		}
		
	}


}
