package Assignment;

public class Date {
 String date_joining;
 String address;
 int pincode;


public Date(String date_joining, String address, int pincode) {
	super();
	this.date_joining = date_joining;
	this.address = address;
	this.pincode = pincode;
}


@Override
public String toString() {
	return "Date [date_joining=" + date_joining + ", address=" + address + ", pincode=" + pincode + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
