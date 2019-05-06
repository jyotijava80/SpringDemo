package org.jyoti.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {
	
	public static void main(String args[])
	{
		
	 //Triangle tg = new Triangle();
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	    
		 
	//	Triangle tg =(Triangle) context.getBean("triangle");
		//Shape tg =(Shape) context.getBean("triangle");
		//Circle circle=(Circle) context.getBean("circle");
		Shape circle=(Circle) context.getBean("circle");
		
	
		System.out.println("Autowire example>>>>>>");
	//	tg.draw();
		circle.draw();
		//System.out.println(context.getMessage("Greeting", null,"Default message!",null));
		
		//context.registerShutdownHook();
	}

}
