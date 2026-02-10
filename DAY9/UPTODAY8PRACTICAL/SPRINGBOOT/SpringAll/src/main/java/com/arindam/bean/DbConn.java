package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="db")
public class DbConn {
	@Value("${driver}")
private String driver;
	@Value("${url}")
private String url;
	@Value("${uname}")
private String uname;
	@Value("${pass}")
private String pass;
public DbConn() {
	super();
	// TODO Auto-generated constructor stub
}
public DbConn(String driver, String url, String uname, String pass) {
	super();
	this.driver = driver;
	this.url = url;
	this.uname = uname;
	this.pass = pass;
}
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "DbConn [driver=" + driver + ", url=" + url + ", uname=" + uname + ", pass=" + pass + "]";
}

}
