package com.jsp.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("xyz");
		person.setEmail("xya@mail.com");
		person.setCno(9513658415l);
		person.setGender("male");
		
		
		BankAccount bankAccount=new BankAccount();
		bankAccount.setBank_name("sbi");
		bankAccount.setAcc_no(9651236485l);
		bankAccount.setIfsc_code("sbi89545656");
		
		
		BankAccount bankAccount1=new BankAccount();
		bankAccount1.setBank_name("sbi");
		bankAccount1.setAcc_no(9854123654l);
		bankAccount1.setIfsc_code("sbi45168");
		
		
		BankAccount bankAccount2=new BankAccount();
		bankAccount2.setBank_name("sbi");
		bankAccount2.setAcc_no(9854123654l);
		bankAccount2.setIfsc_code("sbi45168");
		
		BankAccount bankAccount3=new BankAccount();
		bankAccount3.setBank_name("sbi");
		bankAccount3.setAcc_no(9854123654l);
		bankAccount3.setIfsc_code("sbi45168");
		
	    bankAccount1.setPerson(person);
	    bankAccount2.setPerson(person);
	    bankAccount3.setPerson(person);
	    
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(bankAccount1);
	    entityManager.persist(bankAccount2);
	    entityManager.persist(bankAccount3);
	    entityTransaction.commit();
		
		
		
	}
	

}
