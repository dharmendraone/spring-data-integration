package in.di.beans;

public class Student {

	private String name;
	private String email;
	private Address address;
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Full name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address: "+address);
	}
}
