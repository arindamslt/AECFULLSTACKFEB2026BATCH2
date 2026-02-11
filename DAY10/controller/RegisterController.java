package com.arindam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.arindam.model.Food;
import com.arindam.model.Register;
import com.arindam.service.RegisterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:3000/")
public class RegisterController {
	@Autowired
private RegisterService rservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@Valid @RequestBody Register r)
	{
		String msg="REGISTRATION SUCCESSFULLY";
		rservice.addData(r);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/login/{uname}/{pass}")
	public ResponseEntity<String> checkLogin(@PathVariable String uname,@PathVariable String pass)
	
	{
		String msg=null;
		Register r=rservice.checkLogin(uname, pass);
		if(r!=null)
		{
			msg="LOGIN SUCCESSFULL";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else
		{
			msg="LOGIN FAILURE";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		
	}
}
