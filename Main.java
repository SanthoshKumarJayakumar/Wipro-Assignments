package Milestone1_OOPSInheritance_Inheritance;
/* A HighSchool application has two classes: 
 * the Person superclass and the Student subclass. 
 * Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent.
 * A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and 
 * subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). 
 * The CollegeStudent class will extend the Student class by adding a year (current level in college) and
 * major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/
class ThePerson {
	String work="Cook";
	ThePerson(){
		System.out.println("\n"+"At Home: "+work);
	}
}
class TheStudent{
	String work="Play";
	TheStudent(){
		System.out.println("Hobby: "+work);
	}
}
class Teacher extends ThePerson{
	int salary=9000;
	String subject="English";
	Teacher(){
		System.out.println("Salary: "+salary+"\nSubject: "+subject+"\n");
	}
}
class CollegeStudent extends TheStudent{
	int Curr_Year=2;
	String major="Computer Science";
	CollegeStudent(){
		System.out.println("Curr_Year: "+Curr_Year+"\nMajor: "+major);
	}
}
public class Main{
	public static void main(String [] args){
		CollegeStudent d=new CollegeStudent();
		Teacher f=new Teacher();
	}
}