package com.arindam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Food;
import com.arindam.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired
private FoodRepository frepo;
	public void addData(Food f)
	{
		frepo.save(f);
	}
}
