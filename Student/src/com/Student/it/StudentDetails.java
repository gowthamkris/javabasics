package com.Student.it;

public class StudentDetails {
	
 private String id;
 private String firstName;
 private String lastName;
private String gender;
private String dept;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "StudentDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
			+ ", dept=" + dept + "]";
}
}
