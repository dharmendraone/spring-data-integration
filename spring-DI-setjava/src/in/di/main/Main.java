package in.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.di.beans.Student;
import in.di.resources.SpringConfigration;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
		Student student = context.getBean(Student.class);
		student.display();

	}

}
