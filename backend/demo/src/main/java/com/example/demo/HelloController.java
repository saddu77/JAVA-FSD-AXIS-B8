package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "welcome to SpringBoot Application ";
	}
	
	@PostMapping("/save")
	public String saveData(@RequestBody User data){
		System.out.println(data.getUsername() + " " + data.getPassword());
		System.out.println(data);
		//save in database
		//dbObj.save(data);
		return "data saved successfully";
	}
	
	@GetMapping("/fetch")
	public String fetchData(){
		//read from DB
		
		return "Listing Records soon";
	}
	
	@PutMapping("/update")
	public String updateData(){
		//Update in DB
		return "data updated successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteData(){
		//Delete in DB
		return "data deleted successfully";
	}
	
	
}

// http:localhost:8080/hello  <- request
// welcome to SpringBoot Application <- response