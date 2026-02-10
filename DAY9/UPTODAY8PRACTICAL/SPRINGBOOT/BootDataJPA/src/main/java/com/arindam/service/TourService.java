package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Tour;
import com.arindam.repository.TourRepository;

@Service//OBJECT CREATION+TRANSACTION MANAGEMENT
public class TourService {
	@Autowired
private TourRepository trepo;
	public void addData(Tour t)
	{
		trepo.save(t);
	}
	public List<Tour> getData()
	{
		return trepo.findAll();
	}
	public Tour getTidDetails(String tid)
	{
		return trepo.findById(tid).orElse(null);
	}
	public void deleteData(String tid)
	{
		Tour t=trepo.findById(tid).orElse(null);
		if(t!=null)
		{
			trepo.delete(t);
		}
	}
	public void updateData(String tid,Tour newtour)
	{
		Tour oldtour=trepo.findById(tid).orElse(null);
		if(oldtour!=null)
		{
			oldtour.setTname(newtour.getTname());
			oldtour.setPrice(newtour.getPrice());
			trepo.save(oldtour);
		}
	}
	public List<Tour> getCost(Double cost)
	{
		return trepo.getCost(cost);
	}
}
