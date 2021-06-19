package com.example.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid;
	private String stuName;
	private String stuEmail;
	private String stuMajor;
	private double class1gpa;
	private double class2gpa;
	private double class3gpa;
	private int age;
	int x;
	double aver;
	
	@Autowired
	@Qualifier("address")
	private Address address;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuMajor() {
		return stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public double getClass1gpa() {
		return class1gpa;
	}

	public void setClass1gpa(double class1gpa) {
		this.class1gpa = class1gpa;
	}

	public double getClass2gpa() {
		return class2gpa;
	}

	public void setClass2gpa(double class2gpa) {
		this.class2gpa = class2gpa;
	}

	public double getClass3gpa() {
		return class3gpa;
	}

	public void setClass3gpa(double class3gpa) {
		this.class3gpa = class3gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void generateId() {
		x = (int)(Math.random()*((1000-sid)+1))+sid;
		System.out.println("Student Id number : " + x);
	}
	
	public void show() {
		System.out.println(" ");
		System.out.println("Student information");
		System.out.println("------------------------");
		System.out.println("Student name : " + stuName);
		System.out.println("Student Email : " + stuEmail);
		System.out.println("Student Major : " + stuMajor);
		System.out.println("Student Class1 gpa : " + class1gpa);
		System.out.println("Student Class2 gpa : " + class2gpa);
		System.out.println("Student Class3 gpa : " + class3gpa);
		System.out.println("StudentAge : " + age);
		address.address();
	}
	
	public void classaverage() {
		double average = (class1gpa + class2gpa + class3gpa) / 3;
		aver = Math.round(average*100.0)/100.0;
		System.out.println(aver);
		
	}

	
	
	
}
