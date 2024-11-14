package in.di.beans;

public class Student {
	
	private String name;
	private String email;
	private Address address;
	
	public Student(String name, String email, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Full name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address: "+address);
	}
	
	

}
