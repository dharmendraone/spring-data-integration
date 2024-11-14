package in.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.di.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config = "in/di/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);

		Student std = (Student) context.getBean("std1");
		std.display();

	}

}
