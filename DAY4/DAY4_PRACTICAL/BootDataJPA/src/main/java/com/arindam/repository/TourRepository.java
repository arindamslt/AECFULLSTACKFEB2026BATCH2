package com.arindam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arindam.model.Tour;
@Repository//OBJECT CREATION + DATABASE OPERATION
public interface TourRepository extends JpaRepository<Tour, String> {
	@Query("from Tour where price>:cost")
public List<Tour> getCost(Double cost);
}
