package com.arindam.app;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.arindam.entity.Adhar;
import com.arindam.entity.Candidate;
import com.arindam.entity.Employee;
import com.arindam.entity.Job;
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
	//em.persist(e1);
	//em.persist(e2);
	Adhar ah1=new Adhar("74747", "KOLKATA");
	Adhar ah2=new Adhar("453453654", "DELHI");
	Candidate c1=new Candidate("C1","ROBIN",ah1);
	Candidate c2=new Candidate("C2","AJOY",ah2);
	/*em.persist(ah1);
	em.persist(ah2);
	em.persist(c1);
	em.persist(c2);*/
	System.out.println("CRUD OPERATION=============");
	System.out.println("1.TABLE CREATION AND INSERT DATA");
	Job j1=new Job("J1","DEVELOPER", "SPRINGBOOT");
	Job j2=new Job("J2","ANALYST", "PYTHON");
	//em.persist(j1);
	//em.persist(j2);
	System.out.println("2.FETCHING ALL RECORDS=========");
	String hql="from Job";//select * from job
	String jpql="select j from Job j";
//	Query query=em.createQuery(hql);
	Query query=em.createQuery(jpql);
	List<Job> jlist=query.getResultList();
	jlist.stream().forEach(System.out::println);
	System.out.println("3.DELETE DATA==========");
	Job job=em.find(Job.class,"J2");
	if(job!=null)
	{
		em.remove(job);
	}
	List<Job> jlist1=query.getResultList();
	jlist1.stream().forEach(System.out::println);
	System.out.println("4.UPDATA DATA==============");
	Job updjob=em.find(Job.class,"J1");
	if(updjob!=null)
	{
		updjob.setJobnm("MARKETING");
		updjob.setDomain("MARKETING RESEARCH");
		em.merge(updjob);
	}
	List<Job> jlist2=query.getResultList();
	jlist2.stream().forEach(System.out::println);
	tx.commit();//SAVING DATA PERMANENTLY
	emf.close();
	
	}

}
