package com.spring.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Employee employee = (Employee) context.getBean(Employee.class);//Employee class ka getBEan chahiye isliye Employee class ek component hai

		System.out.println("EmpID : " + employee.getEmpId());
		System.out.println("EmpName : " + employee.getEmpName());
		System.out.println(employee.getPassObj().toString());
		
		context.close();
	}

}

/*Notes:Iss question me mainly @Component tarike se bean create kiya gya hai.Aur xml file use nhi krne bola hai isliye @Bean tarike se bhi bean create kiya hai.


*/
