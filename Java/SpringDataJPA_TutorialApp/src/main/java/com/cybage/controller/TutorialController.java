package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Tutorial;
import com.cybage.service.TutorialService;

@RestController()
@RequestMapping("/tutorial")
public class TutorialController {

	@Autowired
	private TutorialService service;

	@PostMapping("/")
	public ResponseEntity<String> addTutorial(@RequestBody Tutorial tutorial) {
		service.addTutorial(tutorial);
		return new ResponseEntity<String>("Record added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<Tutorial>> getAllTutorial() {
		return new ResponseEntity<List<Tutorial>>(service.getTutorials(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTutorial(@PathVariable int id) {
		Tutorial index = service.getById(id);
		service.removeTutorial(index);
		return new ResponseEntity<String>("Record deleted successfully", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable int id) {
		Tutorial tutorial = service.getById(id);

		return new ResponseEntity<Tutorial>(tutorial, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateTutorial(@RequestBody Tutorial tutorial) {

		service.updateTutorial(tutorial);
		return new ResponseEntity<String>("Record updated successfully", HttpStatus.CREATED);
	}

	@GetMapping("/byName/{tutorialName}")
	public ResponseEntity<List<Tutorial>> getTutorialByName(@PathVariable String tutorialName) {

		return new ResponseEntity<List<Tutorial>>(service.getTutorialByName(tutorialName), HttpStatus.OK);
	}

	@GetMapping("/byId/{id}")
	public ResponseEntity<List<Tutorial>> getTutorialByName(@PathVariable int id) {

		return new ResponseEntity<List<Tutorial>>(service.getTutorialIdGreaterThan(id), HttpStatus.OK);
	}

	@GetMapping("/getByDescr/{description}/{name}")
	public ResponseEntity<List<Tutorial>> getByDescription(@PathVariable String description,
			@PathVariable String name) {

		return new ResponseEntity<List<Tutorial>>(service.getByDescription(description, name), HttpStatus.OK);
	}
}
