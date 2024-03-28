package com.solventek.RegisterController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solventek.RegisterEntity.Register;
import com.solventek.RegisterRepo.RegisterRepo;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:8080/register/add")
public class RegisterController {

	@Autowired
	RegisterRepo registerRepo;
	
	@PostMapping("/add")
	public ResponseEntity<String> createUser(@RequestBody Register register){
		
		registerRepo.save(register);
		return new ResponseEntity<String>("create successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Register>> getUsers(){
	List<Register> list=	registerRepo.findAll();
		return new ResponseEntity<List<Register>>(list,HttpStatus.ACCEPTED);
	}
	
}