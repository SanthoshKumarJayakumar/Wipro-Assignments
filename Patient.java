package Milestone1_OOPSInheritance_ClassesObjects;

import java.util.Scanner;

/* Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. Here’s what the class should do: 
1. Construct a class called Patient
2. Store a String name for the patient
3. Store weight and height for patient as doubles
4. Construct a new patient using these values
5. Write a method called BMI which returns the patient’s BMI as a double.
   BMI can be calculated as BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
6. Next, construct a class called “Patients” and create a main method.
   Create a Patient object and assign some height and weight to that object. 
   Display the BMI of that patient.
*/

class CallMethod3{
	double Bmi(String Name, double weight ,double height){
		double BMI=(weight/( height * height))*703;
		return BMI;
	}	
}
public class Patient {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Patient Name");
		String Name=d.nextLine();
		CallMethod3 p=new CallMethod3();
		System.out.println("BMI for "+Name+" is "+p.Bmi(Name,53,125));
	}
}
