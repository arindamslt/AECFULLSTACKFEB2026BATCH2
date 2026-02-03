package com.arindam.app;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.arindam.entity.Employee;
import com.arindam.entity.Student;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");//READING THE PERSISTANCE>XML FILE
	EntityManager em=emf.createEntityManager();//insert,update,delete
	EntityTransaction tx=null;//commit,rollback,savepoint
	tx=em.getTransaction();
	tx.begin();//login in db
	Student sd1=new Student(1,"SUMAN","IT");
	//em.persist(sd1);//TABLE CREATED DATA INSERTED
	Employee e1=new Employee();
	Employee e2=new Employee();
	e1.setEname("ARUP");
	e1.setJob("MANAGER");
	e1.setSal(75000.00);
	e1.setJoindt(new Date());
	e1.setWorkhr(new Date());
	
	e2.setEname("AYAN");
	e2.setJob("MANAGER");
	e2.setSal(65000.00);
	e2.setJoindt(new Date());
	e2.setWorkhr(new Date());
	em.persist(e1);
	em.persist(e2);
	tx.commit();//SAVING DATA PERMANENTLY
	emf.close();
	
	}

}
