package com.Student.it;

public class Details {//extends StudentDetails {
	public void display(StudentDetails sd)
	{
		System.out.println("StudentDetails:"+sd);
		
	}
public static void main(String a[])
{
	StudentDetails sd=new StudentDetails();
	sd.setId("123");
	sd.setFirstName("gowtham");
	sd.setLastName("karthik");
	sd.setGender("male");
	sd.setDept("IT");
	Details d1=new Details();
	d1.display(sd);
	
}
}
