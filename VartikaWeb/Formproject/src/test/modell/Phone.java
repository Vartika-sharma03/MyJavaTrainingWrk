package test.modell;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@SuppressWarnings("deprecation")
@Entity
@Table(name = "PHONEsim")
public class Phone {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECORD_ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String no;
	
	@OneToOne
	@JoinColumn(name = "EMP_ID")
	private Employee1 emp;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Employee1 getEmp() {
		return emp;
	}

	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}

}