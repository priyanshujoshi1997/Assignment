package co.priyanshu.DemoHib;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Laptop
{
@Id
private int lid;
private String l_name;
								/*@ManyToOne
								student stu;*/
@ManyToMany
List<student> stu=new ArrayList<student>();



public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) 
{
	this.l_name = l_name;
}
public List<student> getStu() {
	return stu;
}
public void setStu(List<student> stu) {
	this.stu = stu;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", l_name=" + l_name + "]";
}

}

