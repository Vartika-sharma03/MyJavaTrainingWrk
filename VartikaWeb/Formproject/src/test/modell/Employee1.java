package test.modell;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEEss")
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECORD_ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name="AGE")
	private Integer age;
	
	@OneToOne(mappedBy = "emp")
	private Phone phone;
	
	public Employee1() {
	}
	
	public Employee1(String namee, int i) {
		// TODO Auto-generated constructor stub
        name=namee;
        age = i;
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}