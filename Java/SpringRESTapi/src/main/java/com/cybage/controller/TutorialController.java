package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.Tutorial;
import com.cybage.service.TutorialService;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {
	@Autowired
	TutorialService tutorialService;

	@GetMapping("/")
	public ResponseEntity< List<Tutorial> >getAllTutorial() {
		return new ResponseEntity<List<Tutorial>>(tutorialService.getTutorials(),HttpStatus.OK);

	}
	
	

//	@PostMapping("/")
//	public String addTutorial(@RequestBody Tutorial tutorial) {
//		tutorialService.addTutorial(tutorial);
//		return "Tutorial added successfully";
//
//	}
	
	
	@PostMapping("/")
	public ResponseEntity<String> addTutorial(@RequestBody Tutorial tutorial) {
		tutorialService.addTutorial(tutorial);
		return new ResponseEntity<String>("Tutorial added successfully", HttpStatus.CREATED);

	}
	@GetMapping("/{id}")
	public ResponseEntity<Tutorial> getTutorial(@PathVariable int id)
	{
		Tutorial tutorial=tutorialService.getById(id);
		if(tutorial==null)
			throw new RecordNotFoundException("Record not found");
		return new ResponseEntity<Tutorial>(tutorial ,HttpStatus.OK);
	}
	
	

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTutorial(@PathVariable int id)
	{
		tutorialService.deleteTutorial(id);
		return new ResponseEntity<String>("record deletted",HttpStatus.OK);
	}
	
//	@ExceptionHandler(RecordNotFoundException.class)
//	public ResponseEntity<String>handleException(RecordNotFoundException exception)
//	{
//		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
