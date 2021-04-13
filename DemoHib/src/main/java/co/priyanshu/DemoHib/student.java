package co.priyanshu.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.*;

@Entity  //(name="Student_tbl")//one way
//@Table(name="Student_table")
public class student 
{
	@Id
	private int roll_no;
	private StudentName name;
										//@Column(name="Programme")
	private String course;
										/*@OneToMany(mappedBy="stu")
										private List<Laptop> laptop=new ArrayList<Laptop>();*///@oneToone private String laptop
	@ManyToMany(mappedBy="stu",fetch=FetchType.EAGER)
	private List<Laptop> laptop=new ArrayList<Laptop>();
	public StudentName getName() {
		return name;
	}

	public void setName(StudentName name)
	{
		this.name = name;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "student [roll_no=" + roll_no + ", name=" + name + ", course=" + course + "  ,laptop="+laptop+"]";
	}
	
}
