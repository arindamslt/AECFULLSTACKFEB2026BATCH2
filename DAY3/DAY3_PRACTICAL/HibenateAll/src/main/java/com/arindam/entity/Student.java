package com.arindam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private Integer rollno;
private String sname;
private String deptnm;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer rollno, String sname, String deptnm) {
	super();
	this.rollno = rollno;
	this.sname = sname;
	this.deptnm = deptnm;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getDeptnm() {
	return deptnm;
}
public void setDeptnm(String deptnm) {
	this.deptnm = deptnm;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", sname=" + sname + ", deptnm=" + deptnm + "]";
} 

}
