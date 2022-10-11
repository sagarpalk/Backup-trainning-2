package Assignment;

public class Address {
	int pincode;
	String city;
	String state;
	Date dob;

	public Address(int pincode, String city, String state,Date dob) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + ", dob=" + dob + "]";
	}
}
