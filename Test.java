package Milestone1_OOPSInheritance_PolymorphismOverriding;
/*Create  a base class Fruit which has name ,taste and size as its attributes. 
 * A method called eat() is created which describes the name of the fruit and its taste.  
 * Inherit the same in 2 other class Apple and Orange and override the eat() method to represent each fruit taste.
*/
class Fruit {
	String name="Banana";
	String taste="Sweet";
	String size="Small";
	void eat(){
		System.out.println(name+" is "+taste);
	}
}
class Apple extends Fruit {
	String name="Apple";
	String taste="Bitter Sweet";
	String size="Normal";
	void eat(){
		System.out.println(name+" is "+taste);
	}
}
class Orange extends Fruit {
	String name="Orange";
	String taste="Salty";
	String size="Large";
	void eat(){
		System.out.println(name+" is "+taste);
	}
}
class Test{
	public static void main(String []args){
		Fruit g=new Fruit();	
		g.eat();
		Fruit h=new Apple();
		h.eat();
		Fruit i=new Orange();
		i.eat();
	}
}