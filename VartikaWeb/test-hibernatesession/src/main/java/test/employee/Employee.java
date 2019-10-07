package test.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "LasT_Name")
	private String lastName;

	@Column(name = "Salary")
	private int salary;

	public  Employee() {
		// TODO Auto-generated constructor stub
	} 
	
	public Employee(String fname, String lname, int salary) {
	this.firstName = fname;
	this.lastName = lname;
	this.salary = salary;
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
		}
	public String getFirstName() {
	return firstName;
	}
	public void setLastName(String last_name) {
		this.lastName = last_name;
		}

	public String getLastName() {
	return lastName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
		}
	
	public int getSalary() {
	return salary;
	}

	
	}
