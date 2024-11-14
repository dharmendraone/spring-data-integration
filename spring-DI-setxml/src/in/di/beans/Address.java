package in.di.beans;

public class Address {

	private String area;
	private String city;
	private int pincode;

	public void setArea(String area) {
		this.area = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "" + area + ", " + city + ", " + pincode;
	}
}
