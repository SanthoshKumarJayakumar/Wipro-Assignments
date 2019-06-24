package Milestone1_OOPSInheritance_ClassesObjects;
/*1. A static method called powerInt(int num1,int num2) that accepts two integers 
and returns num1 to the power of num2 (num1 power num2). 
2. A static method called powerDouble(double num1,int num2) that accepts one
 double and one  integer and returns num1 to the power of num2 (num1 power num2). 
3. Call your method from another class without instantiating the class 
(i.e. call it like Calculator.powerInt(12,10) since your methods are defined to be static)
Hint: Use Math.pow(double,double) to calculate the power.
*/
class CallMethod {
	static int powerInt(int num1,int num2){
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2){
		return (int) Math.pow(num1, num2);
	}
}
public class Calculator{
	public static void main(String [] args){
		CallMethod cm=new CallMethod();
		System.out.println(cm.powerInt(2, 10));
		System.out.println(cm.powerDouble(12, 10));
	}
	
}
