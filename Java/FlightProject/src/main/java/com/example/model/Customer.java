package com.example.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;

	private String userName;
	private String gender;
	private String userEmail;
	private int contactNumber;
	private int age;

	@OneToMany
	@JoinColumn(name = "complaintId")
	private List<Complaint> complaint;
	
	@OneToMany
	@JoinColumn(name="bookingId")
	private List<Booking> booking;

	public Customer() {
		super();
	}

	public Customer(int custId, String userName, String gender, String userEmail, int contactNumber, int age,
			List<Complaint> complaint, List<Booking> booking) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.gender = gender;
		this.userEmail = userEmail;
		this.contactNumber = contactNumber;
		this.age = age;
		this.complaint = complaint;
		this.booking = booking;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", userName=" + userName + ", gender=" + gender + ", userEmail="
				+ userEmail + ", contactNumber=" + contactNumber + ", age=" + age + ", complaint=" + complaint
				+ ", booking=" + booking + "]";
	}
	
	

	
	
	
	

}
