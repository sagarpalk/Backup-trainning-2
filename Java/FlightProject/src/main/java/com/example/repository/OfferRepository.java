package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.model.Offer;


@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer>{

}
