package com.example.coreproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component


public class Person {
	private int pid = 0;
	private String fname;
	private String lname;
	private int age;
	int x;
	
	@Autowired
	@Qualifier("address")
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void generateId() {
		x = (int)(Math.random()*((1000-pid)+1))+pid;
		System.out.println("Id number : " + x);
	}
	
	public void show() {
		System.out.println(" ");
		System.out.println("Person information");
		System.out.println("------------------------");
		System.out.println("First name : " + fname);
		System.out.println("Last name : " +lname);
		System.out.println("Age : " + age);
		address.address();
	}
}
