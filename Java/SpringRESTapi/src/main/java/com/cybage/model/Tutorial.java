package com.cybage.model;

public class Tutorial {
	
	private int tutorialId;
	
	private String tutorialName;
	
	private String description;
	
	
	public Tutorial() {
		
	}
	
	public Tutorial(int tutorialId, String tutorialName, String description) {
		super();
		this.tutorialId = tutorialId;
		this.tutorialName = tutorialName;
		this.description = description;
	}
	public int getTutorialId() {
		return tutorialId;
	}
	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}
	public String getTutorialName() {
		return tutorialName;
	}
	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Tutorial [tutorialId=" + tutorialId + ", tutorialName=" + tutorialName + ", description=" + description
				+ "]";
	}
	
	
}
