package com.Frompojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FormInfo")
public class FormPojo {


	@Column(name="FirstName")
	private String fname;

	@Column(name="LastName")
	private String lname;

	@Column(name="Address")
	private String add;
	@Id
	@Column(name="rollno")
	private int rollno;
	public String getFirstName() {
		return fname;
	}
	public void setFirstName(String firstName) {
		fname = firstName;
	}
	public String getLastName() {
		return lname;
	}
	public void setLastName(String lastName) {
		lname = lastName;
	}
	public String getAddress() {
		return add;
	}
	public void setAddress(String address) {
		add = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "FormPojo [FirstName=" + fname + ", LastName=" + lname + ", Address=" + add + ", rollno=" + rollno
				+ "]";
	}

}
