package in.di.beans;

public class Address {
	
	private String area;
	private String city;
	private int pincode;

	public Address(String area, String city, int pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return area + ", " + city + ", " + pincode;
	}
	


}
