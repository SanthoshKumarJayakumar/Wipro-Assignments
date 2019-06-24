package Milestone1_OOPSInheritance_Inheritance;

class Employee extends Person{
	double Annual_salary=500000;
	String Join_year="1990";
	String National_Ins_no="4568";
	Employee(){
		System.out.println("Annual_salary: "+Annual_salary+"\n"+"Join_year: "+Join_year+"\n"+"National_Ins_no: "+National_Ins_no);
	}
}
