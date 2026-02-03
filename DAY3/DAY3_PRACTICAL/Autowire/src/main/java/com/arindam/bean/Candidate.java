package com.arindam.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "cnd")
public class Candidate {
	@Value("C1")
private String candid;
	@Value("JYOTI") 
private String candnm;
	@Value("DELHI")
private String address;
	@Autowired
private Job job;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(String candid, String candnm, String address, Job job) {
		super();
		this.candid = candid;
		this.candnm = candnm;
		this.address = address;
		this.job = job;
	}
	public String getCandid() {
		return candid;
	}
	public void setCandid(String candid) {
		this.candid = candid;
	}
	public String getCandnm() {
		return candnm;
	}
	public void setCandnm(String candnm) {
		this.candnm = candnm;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Candidate [candid=" + candid + ", candnm=" + candnm + ", address=" + address + ", job=" + job + "]";
	}
	
}
