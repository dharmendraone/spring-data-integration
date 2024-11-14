package in.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.di.beans.Address;
import in.di.beans.Student;

@Configuration
public class SpringConfigration {

	@Bean
	public Address addObj() {
		Address add = new Address();
		add.setArea("Kolar colony");
		add.setCity("Bhopal");
		add.setPincode("462016");
		return add;
	}

	@Bean
	public Student stdObj() {
		Student std = new Student();
		std.setName("Dharmendra Patel");
		std.setEmail("dharmendra@gmail.com");
		std.setAddress(addObj());
		return std;
	}

}
