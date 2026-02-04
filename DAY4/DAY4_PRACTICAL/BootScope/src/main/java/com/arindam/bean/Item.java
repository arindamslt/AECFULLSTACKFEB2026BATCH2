package com.arindam.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope("singleton")
public class Item {
private String icode;
private String iname;
private Double price;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(String icode, String iname, Double price) {
	super();
	this.icode = icode;
	this.iname = iname;
	this.price = price;
}
public String getIcode() {
	return icode;
}
public void setIcode(String icode) {
	this.icode = icode;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Item [icode=" + icode + ", iname=" + iname + ", price=" + price + "]";
}

}
