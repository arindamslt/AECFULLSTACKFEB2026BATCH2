package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="exp")
public class Expertise {
	@Value("JAVA")
private String tech;
	@Value("6.5")
private Double yexp;
	public Expertise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expertise(String tech, Double yexp) {
		super();
		this.tech = tech;
		this.yexp = yexp;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Double getYexp() {
		return yexp;
	}
	public void setYexp(Double yexp) {
		this.yexp = yexp;
	}
	@Override
	public String toString() {
		return "Expertise [tech=" + tech + ", yexp=" + yexp + "]";
	}
	
}
