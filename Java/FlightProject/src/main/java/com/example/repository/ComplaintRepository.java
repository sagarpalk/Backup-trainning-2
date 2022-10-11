package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Complaint;



@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Integer>{

}
