package com.example.coreproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int epid = 0;
	private String empName;
	private String empEmail;
	private String empPosition;
	private double empSalary;
	private int age;
	int x;
	double rate;
	double roundDbl;
	
	@Autowired
	@Qualifier("address")
	private Address address;     
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEpid() {
		return epid;
	}
	public void setEpid(int epid) {
		this.epid = epid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void generateId() {
		x = (int)(Math.random()*((1000-epid)+1))+epid;
		System.out.println("Employee Id number : " + x);
	}
	
	public void show() {
		System.out.println(" ");
		System.out.println("Employee information");
		System.out.println("------------------------");
		System.out.println("Employee name : " + empName);
		System.out.println("Employee Email : " +empEmail);
		System.out.println("Employee Position : " +empPosition);
		System.out.println("Employee Salary : " +empSalary);
		System.out.println("Employee Age : " + age);
		System.out.println("Employee complete addres : "); 
		address.address();
	}
	
	public void hourlyRate() {
		System.out.println("Hourly rate based off a 261 day work year : ");
		rate = empSalary / 261;
		roundDbl = Math.round(rate*100.0)/100.0;
		System.out.println("$" + roundDbl);
	}
	

}
