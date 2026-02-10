package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.model.Tour;
import com.arindam.service.TourService;

@SpringBootApplication
public class BootDataJpaApplication implements CommandLineRunner {
	@Autowired
private TourService tservice;
	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Tour t=new Tour("T2", "KUMAYON",30000.00);
		//tservice.addData(t);
	
		System.out.println("FETCH DATA BASED ON PRIMARY KEY");
		Tour ts=tservice.getTidDetails("T2");
		System.out.println(ts);
		System.out.println("DELETE DATA==============");
		//tservice.deleteData("T2");
		System.out.println("UPDATE DATA==========");
		Tour newtour=new Tour("T1","SIKKIM TOUR", 27000.00);
		//tservice.updateData("T1", newtour);
		System.out.println("FETCH ALL THE DATA");
		List<Tour> tlist=tservice.getData();
		tlist.stream().forEach(System.out::println);
		System.out.println("FIND OUT THOSE TOUR COST GREATER THAN 27000.00===");
	    List<Tour> clist=tservice.getCost(27000.00);
	    clist.stream().forEach(System.out::println);
	}

}
