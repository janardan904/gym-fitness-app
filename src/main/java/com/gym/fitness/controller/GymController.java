package com.gym.fitness.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.fitness.model.User;
import com.gym.fitness.service.IGymFitnessService;

@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:4200")
public class GymController {
	
	@Autowired
	private IGymFitnessService service;
	
    @GetMapping(value="/getallusers",produces="application/json")
	public ResponseEntity<List<User>>getalluser(){
		return new ResponseEntity<List<User>>(service.getallusers(),HttpStatus.OK);
		
	}
    
    
    @GetMapping(value="/getuser/{id}",produces="application/json")
   public ResponseEntity<Optional<User>> getuserById(@PathVariable("id")Integer id) {
	   return new ResponseEntity <Optional<User>>(service.getUserById(id),HttpStatus.OK);
   }
    
    
    @PostMapping("/saveuser")
    public ResponseEntity<User>  save(@RequestBody User user) {
    	return new   ResponseEntity<User>(service.RegisterUser(user),HttpStatus.OK);
    }
    
    
    
    @DeleteMapping(value="/deleteuser/{id}")
    public Map<String,Integer> deleteStudent(@PathVariable("id") Integer id) {
     service.deleteUser( id);
     Map<String,Integer>map=new HashMap<>();
     map.put("this record is deleted", id);
    
	return map;
     
    }
    //update the student data
    
    @PutMapping(value="/updatuser/{id}")
	public User updateuser(@PathVariable ("id")Integer  id, @RequestBody User user) {    	
    	return service.updateUser( user,id);
   
		
		
	}
	
}

	
