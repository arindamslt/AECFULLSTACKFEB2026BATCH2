package com.arindam.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Candidate;
import com.arindam.bean.Category;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
//Category cgs=(Category)ac.getBean("cg");
Candidate cds=(Candidate)ac.getBean("cnd");
System.out.println(cds);
//System.out.println(cgs);
	}

}
