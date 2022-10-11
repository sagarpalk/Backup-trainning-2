package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "complaint")
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complaintId;

	private String description;
	private String complaintType;

	public Complaint() {
		super();
	}

	public Complaint(int complaintId, String description, String complaintType) {
		super();
		this.complaintId = complaintId;
		this.description = description;
		this.complaintType = complaintType;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", description=" + description + ", complaintType="
				+ complaintType + "]";
	}

}
