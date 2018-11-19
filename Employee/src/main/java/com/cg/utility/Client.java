package com.cg.utility;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.entity.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sbu.xml");
	   SBU sbu = (SBU) factory.getBean("empl");
	   System.out.println("SBU Details");
	   System.out.println("-------------------------");
	   System.out.println(sbu);
	   System.out.println("Employee Details:-------------------");
	   System.out.println(sbu.getEmpList());
	  
	  /* Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter employee Id:");
	   int id= scanner.nextInt();
	   for (String string : args) {*/
		
	
	   
	   
	   
	   
	}

}
