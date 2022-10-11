package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cybage.model.Tutorial;

@Service
public class TutorialService {
	private List<Tutorial> tutorialList = new ArrayList<Tutorial>();

	public TutorialService() {
		tutorialList.add(new Tutorial(101, "java", "javaTutorial"));
		tutorialList.add(new Tutorial(102, "angular", "angularjavaTutorial"));
		tutorialList.add(new Tutorial(103, "react", "react javaTutorial"));
		tutorialList.add(new Tutorial(104, "c", "c javaTutorial"));
	}

	public List<Tutorial> getTutorials() {
		return tutorialList;
	}

	public void addTutorial(Tutorial tutorial) {
		tutorialList.add(tutorial);
		System.out.println(tutorialList);

	}

	public Tutorial getById(int id) {
		Tutorial tutorial1 = tutorialList.stream().filter(tutorial -> tutorial.getTutorialId() == id).findFirst().get();
		return tutorial1;

	}

//	public void deleteTutorial(Tutorial tutorial) {
//		tutorialList.remove(tutorial);
//		System.out.println(tutorialList);
//
//	}

	public void deleteTutorial(int id) {
		Tutorial tutorial = getById(id);
		tutorialList.remove(tutorial);
	}

	public void updateTutorial(int id, Tutorial tutorial) {
		Tutorial tutorial1=getById(id);
		int index=tutorialList.indexOf(tutorial);
		tutorialList.set(index, tutorial1);
		
	}
}
