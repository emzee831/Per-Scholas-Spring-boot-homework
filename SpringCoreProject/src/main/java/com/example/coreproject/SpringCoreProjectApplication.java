package com.example.coreproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(SpringCoreProjectApplication.class, args);
		Scanner scan=new Scanner(System.in);
		
		//person class
		
//		Person p1 = Context.getBean(Person.class);
//		System.out.println("enter your first name");
//		p1.setFname(scan.next().trim());
//		System.out.println("enter your last name");
//		p1.setLname(scan.next().trim());
//		System.out.println("enter your age");
//		p1.setAge(scan.nextInt());
//		System.out.println("enter your street");
//		scan.nextLine();
//		p1.getAddress().setStreet(scan.nextLine().trim());
//		System.out.println("enter your city ");
//		p1.getAddress().setCity(scan.next().trim());
//		System.out.println("enter your state");
//		p1.getAddress().setState(scan.next().trim());
//		System.out.println("enter your zipcode");
//		p1.getAddress().setZipcode(scan.nextInt());
//		p1.show();
//		p1.generateId();
		
		//employee class
	
//		Employee emp1 = Context.getBean(Employee.class);
//		System.out.println("Enter employees name ");
//		emp1.setEmpName(scan.nextLine().trim());
//		System.out.println("Enter employees email ");
//		emp1.setEmpEmail(scan.next().trim());
//		System.out.println("Enter employees position ");
//		scan.nextLine();
//		emp1.setEmpPosition(scan.nextLine().trim());
//		System.out.println("Enter employees salary ");
//		emp1.setEmpSalary(scan.nextDouble());
//		System.out.println("enter your age");
//		emp1.setAge(scan.nextInt());
//		System.out.println("enter your street");
//		scan.nextLine();
//		emp1.getAddress().setStreet(scan.nextLine().trim());
//		System.out.println("enter your city ");
//		emp1.getAddress().setCity(scan.next().trim());
//		System.out.println("enter your state");
//		emp1.getAddress().setState(scan.next().trim());
//		System.out.println("enter your zipcode");
//		emp1.getAddress().setZipcode(scan.nextInt());
//		emp1.show();
//		emp1.generateId();
//		emp1.hourlyRate();
		
		//student class
		
		Student stu1 = Context.getBean(Student.class);
		System.out.println("Enter students name ");
		stu1.setStuName(scan.nextLine().trim());
		System.out.println("Enter students email ");
		stu1.setStuEmail(scan.next().trim());
		System.out.println("Enter students major ");
		scan.nextLine();
		stu1.setStuMajor(scan.nextLine().trim());
		System.out.println("Enter students class1 gpa ");
		stu1.setClass1gpa(scan.nextDouble());
		System.out.println("Enter students class2 gpa ");
		stu1.setClass2gpa(scan.nextDouble());
		System.out.println("Enter students class3 gpa ");
		stu1.setClass3gpa(scan.nextDouble());
		System.out.println("enter your age ");
		stu1.setAge(scan.nextInt());
		System.out.println("enter your street");
		scan.nextLine();
		stu1.getAddress().setStreet(scan.nextLine().trim());
		System.out.println("enter your city ");
		stu1.getAddress().setCity(scan.next().trim());
		System.out.println("enter your state");
		stu1.getAddress().setState(scan.next().trim());
		System.out.println("enter your zipcode");
		stu1.getAddress().setZipcode(scan.nextInt());
		stu1.show();
		stu1.generateId();
		System.out.println("Students gpa average is : ");
		stu1.classaverage();
		
		
		scan.close();
	}

}
