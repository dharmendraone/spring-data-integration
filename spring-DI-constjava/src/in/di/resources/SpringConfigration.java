package in.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.di.beans.Address;
import in.di.beans.Student;

@Configuration
public class SpringConfigration {
     
	@Bean
	public Address addObj() {
		Address add = new Address("Kolar colony","Bhopal",462016);
		return add;
	}
	
	@Bean
	public Student stdObj() {
		Student std = new Student("Dharmendra Patel","dharmendra@gmail.com",addObj());
		return std;
	}

}
