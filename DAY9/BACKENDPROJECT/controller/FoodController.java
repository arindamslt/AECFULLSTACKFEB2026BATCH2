package com.arindam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Food;
import com.arindam.service.FoodService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins = "http://localhost:3000/")
public class FoodController {
	@Autowired
private FoodService fservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@Valid @RequestBody Food f)
	{
		String msg="FOOD ADDED SUCCESSFULLY";
		fservice.addData(f);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
}
