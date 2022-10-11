package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Booking;
import com.example.model.Report;


@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{

}
