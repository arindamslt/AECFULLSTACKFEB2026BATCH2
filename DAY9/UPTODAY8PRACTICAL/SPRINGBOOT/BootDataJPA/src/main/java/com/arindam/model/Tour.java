package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tour {
	@Id
	@Column(length = 10)
private String tid;
	@Column(length = 25,nullable = false)
private String tname;
private Double price;
public Tour() {
	super();
	// TODO Auto-generated constructor stub
}
public Tour(String tid, String tname, Double price) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.price = price;
}
public String getTid() {
	return tid;
}
public void setTid(String tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Tour [tid=" + tid + ", tname=" + tname + ", price=" + price + "]";
}

}
