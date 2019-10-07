package com.test.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")

// Using @NamedNativeQuery for single native sql query
@NamedNativeQuery(name = "get_total_emp", query = "select count(1) from EMPLOYEE")

// Using @NamedNativeQuery for multiple native sql queries
@NamedNativeQueries({
      // Using @NamedNativeQuery with parameter binding
      @NamedNativeQuery(name = "get_total_emp_by_dept", query = "select count(1) from EMPLOYEE where dpt_id=:did"),

      @NamedNativeQuery(name = "get_all_emp", query = "select * from EMPLOYEE",resultClass=Employee.class) 
  })
public class Employee {

   @Id
   @Column(name = "EMP_ID")
   private int id;

   @Column(name = "NAME")
   private String name;

   @Column(name = "DESIGNATION")
   private String designation;

   @ManyToOne
   @JoinColumn(name = "DPT_ID")
   private Department department;

public void setId(int id)
{
this.id=id;	
}
public int getId() {
	// TODO Auto-generated method stub
	return id;
}

public Department getDepartment() {
	// TODO Auto-generated method stub
	return department;
}
public void setName(String name)
{
this.name=name;	
}
public String getName() {
	// TODO Auto-generated method stub
	return name;
}
public void setDesignation(String designation)
{
this.designation=designation;	
}
public String getDesignation() {
	// TODO Auto-generated method stub
	return designation;
}

   // Getter and Setter methods

}
