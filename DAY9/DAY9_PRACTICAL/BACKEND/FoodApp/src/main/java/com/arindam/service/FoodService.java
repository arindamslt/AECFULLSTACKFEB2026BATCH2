package com.arindam.service;

import java.util.List;

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
	public List<Food> getData()
	{
		return frepo.findAll();
	}
	public Food getFidDetails(String fid)
	{
		return frepo.findById(fid).orElse(null);
	}
	public void deleteData(String fid)
	{
		Food f=frepo.findById(fid).orElse(null);
		if(f!=null)
		{
		frepo.delete(f);
		}
	}
	public void updateData(String fid,Food newfood)
	{
		Food f=frepo.findById(fid).orElse(null);
		if(f!=null)
		{
		    f.setFname(newfood.getFname());
		    f.setPrice(newfood.getPrice());
		    frepo.save(f);
		}
	}
}
