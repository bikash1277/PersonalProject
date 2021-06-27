package excelFunctions;

import java.util.Date;
public class Employee 
{
	String name;
	String email;
	Date DateOfBirth;
	double salary;
    public Employee(String name, String email, Date time, double d) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date time) {
		this.DateOfBirth = time;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
