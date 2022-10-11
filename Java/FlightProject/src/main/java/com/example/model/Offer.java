package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "offers")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int offerId;
	
	private String offerName;
	private int offerRate;

	public Offer() {
		super();
	}

	public Offer(int offerId, String offerName, int offerRate) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerRate = offerRate;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getOfferRate() {
		return offerRate;
	}

	public void setOfferRate(int offerRate) {
		this.offerRate = offerRate;
	}

	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", offerName=" + offerName + ", offerRate=" + offerRate + "]";
	}
	
	

}
