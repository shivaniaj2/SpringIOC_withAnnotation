package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(MyConfigClass.class);
//		Employee e=context.getBean(Employee.class);
//		e.setEmp_id(1);
//		e.setEmp_name("shiv");
//		e.setSalary(20000);
//		System.out.println(e);
		
		Employee e=context.getBean(Employee.class);
		Employee e1=context.getBean(Employee.class);
		System.out.println(e==e1);
	}

}
