package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Booking;
import com.example.model.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
