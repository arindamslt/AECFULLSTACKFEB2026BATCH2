package com.arindam.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="jbs")
public class Job {
	@Value("J1")
private String jid;
	@Value("JAVA DEVELOPER")
private String jnm;
	@Value("XYZLTD")
private String compnm;
	@Autowired
	private Expertise exp;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String jid, String jnm, String compnm, Expertise exp) {
		super();
		this.jid = jid;
		this.jnm = jnm;
		this.compnm = compnm;
		this.exp = exp;
	}
	public String getJid() {
		return jid;
	}
	public void setJid(String jid) {
		this.jid = jid;
	}
	public String getJnm() {
		return jnm;
	}
	public void setJnm(String jnm) {
		this.jnm = jnm;
	}
	public String getCompnm() {
		return compnm;
	}
	public void setCompnm(String compnm) {
		this.compnm = compnm;
	}
	public Expertise getExp() {
		return exp;
	}
	public void setExp(Expertise exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jnm=" + jnm + ", compnm=" + compnm + ", exp=" + exp + "]";
	}
	
}
