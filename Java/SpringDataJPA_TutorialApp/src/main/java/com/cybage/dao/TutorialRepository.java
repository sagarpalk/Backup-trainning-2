package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer>{
	
	 public List<Tutorial> findByTutorialName(String tutorialName);
	 
	 public List<Tutorial> findByTutorialIdGreaterThan(int no);
	 //@Query("from tutorial where description= :description and tutorialName= :name")
	 @Query("from Tutorial where description=?1 and tutorialName=?2")
	 List<Tutorial>findByDescription(String description,String tutorialName);
}
 