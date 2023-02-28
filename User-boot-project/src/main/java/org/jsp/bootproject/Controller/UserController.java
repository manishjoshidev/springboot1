
package org.jsp.bootproject.Controller;
       
import java.util.List;                                         

import org.jsp.bootproject.Repository.userRepository;
import org.jsp.bootproject.dto.ResponseStructure;
import org.jsp.bootproject.dto.User;
import org.jsp.bootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/user")
//@CrossOrigin("http://localhost:8080")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
		return service.saveUser(user);
	
	}
	@PutMapping("/user")
	public ResponseStructure<User> updateUSer(@RequestBody User user) {
		return service.updateUser(user);
		
	}
	@DeleteMapping("/user/{id}")
	public ResponseStructure<String> deleteUSer(@PathVariable int id) {
		return service.deleteUser(id);
		
	}
	@GetMapping("/user/{id}")
	public ResponseStructure<User>findUser(@PathVariable int id){
		return service.findUser(id);
		
	}
	@GetMapping("/User/all")
	public ResponseStructure<List<User>>findAllUser(){
		return service.findAllUser();
	}
	@PostMapping("/User/verify")
	public ResponseStructure<User>verifyUser(@RequestParam long phn,@RequestParam String password)
	{
		return service.verifyUser(phn,password);
	}
	}

