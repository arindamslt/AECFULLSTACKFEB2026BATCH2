package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Item;

@SpringBootApplication
public class BootScopeApplication implements CommandLineRunner{
	@Autowired
private Item it1;
	@Autowired
private Item it2;
	public static void main(String[] args) {
		SpringApplication.run(BootScopeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		it1.setIcode("I1");
		it1.setIname("TV");
		it1.setPrice(25000.00);
		it2.setIcode("I2");
		it2.setIname("TAB");
		it2.setPrice(22000.00);
		System.out.println(it1);
		System.out.println(it2);
	}

}
