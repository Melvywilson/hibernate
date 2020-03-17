package com.new1;

public class Employee {
private String firstName;
private String lastName;
private int salary;
private int employeeId;
public int getEmployeeId() {
	return this.employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public Employee(String firstName,String lastName,int salary)
{this.firstName=firstName;
this.lastName=lastName;
this.salary=salary;}
public String getFirstName() {
	return this.firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return this.lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getSalary() {
	return this.salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
