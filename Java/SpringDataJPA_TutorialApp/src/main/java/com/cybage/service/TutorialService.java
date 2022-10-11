package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.TutorialRepository;
import com.cybage.model.Tutorial;

@Service
public class TutorialService {
	@Autowired
	private TutorialRepository dao;

	public void addTutorial(Tutorial tutorial) {
		System.out.println(tutorial);
		dao.save(tutorial);
	}

	public List<Tutorial> getTutorials() {
		return dao.findAll();
	}

	public Tutorial getById(int id) {
		dao.findById(id);
		return dao.getById(id);
	}

	public void removeTutorial(Tutorial tut) {
		dao.delete(tut);
		System.out.println("Record deleted");
	}

	public void updateTutorial(Tutorial tut) {
		dao.save(tut);
	}

	public List<Tutorial> getTutorialByName(String tutorialName) {
		return dao.findByTutorialName(tutorialName);
	}

	public List<Tutorial> getTutorialIdGreaterThan(int no) {
		return dao.findByTutorialIdGreaterThan(no);
	}

	public List<Tutorial> getByDescription(String description, String name) {
		return dao.findByDescription(description, name);
	}

}
