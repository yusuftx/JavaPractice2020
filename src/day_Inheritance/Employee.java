package day_Inheritance;

//Encapsulation
public class Employee {
private int employee_id;
private String firstName;
private String lastName;
private String email;
private double salary;

public Employee(int employee_id, String firstName, String lastName, String email, double salary) {
	this.employee_id = employee_id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.salary = salary;
	
}

public int getEmployeeId() {
	return employee_id;
}
public void setEmployeeId(int employee_id) {
	this.employee_id = employee_id;
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

public void setLastName() {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
