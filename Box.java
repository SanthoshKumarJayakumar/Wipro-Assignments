package Milestone1_OOPSInheritance_ClassesObjects;

/* Create a class Box that uses a parameterized method to initialize the dimensions of a box.
 * (dimensions are width, height, depth of double type). 
 * The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function.	
 * Classes and Objects, Constructor
 */
class Box1{
	double Box(double width,double height,double depth){
		double v=width*height*depth;
		return v;
	}
}
public class Box {
	public static void main(String[] args) {
		Box1 o=new Box1();
		double a=o.Box(1,2,2);
		System.out.println(o.Box(1,2,2));
	}
}
	