package in.student.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.student.college_details;
import in.swadhin.configuration.javaconf;

public class main {

	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(javaconf.class);
		college_details cd=(college_details)context.getBean("college");
		cd.display();
	}
}
