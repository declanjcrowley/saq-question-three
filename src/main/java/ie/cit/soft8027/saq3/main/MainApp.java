package ie.cit.soft8027.saq3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cit.soft8027.saq3.domain.Newspaper;

public class MainApp {

	private static ApplicationContext context;

	public static void main (String args[]){
		
		context = new ClassPathXmlApplicationContext("configuration.xml");
		
		Newspaper npone = (Newspaper) context.getBean("npone");
		System.out.println(npone.toString());
	}
}
