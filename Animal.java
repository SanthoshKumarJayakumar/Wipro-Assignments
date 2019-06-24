package Milestone1_OOPSInheritance_Inheritance;
/* Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. 
Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/
class Animal1 {
	void eat(){
		System.out.println("Parent Eat");
	}
	void sleep(){
		System.out.println("Parent Sleep");
	}
}
class Bird extends Animal1{
	void eat(){
		System.out.println("Child Eat");
	}
	void sleep(){
		System.out.println("Child Sleep");
	}
	void fly(){
		System.out.println("Child Fly");

	}
}
public class Animal{
	public static void main (String [] args){
		Animal1 a=new Animal1();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}