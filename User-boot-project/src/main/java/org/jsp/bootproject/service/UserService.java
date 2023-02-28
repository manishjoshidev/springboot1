package org.jsp.bootproject.service;

import java.util.List;
import java.util.Optional;

import org.jsp.bootproject.dao.UserDao;
import org.jsp.bootproject.dto.ResponseStructure;
import org.jsp.bootproject.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserService {      

	@Autowired
		private UserDao dao;
	
	public ResponseStructure<User> saveUser(@RequestBody User user){
		ResponseStructure<User> structure =new ResponseStructure<User>();
		structure.setBody(dao.saveUser(user));
		structure.setMessage("user saved successfully");
		structure.setCode(HttpStatus.FOUND.value());
		return structure;
		
		}
	public ResponseStructure<User> updateUser(@RequestBody User user){
		ResponseStructure<User> structure = new ResponseStructure<User>();
		 structure.setBody(dao.saveUser(user));
		 structure.setMessage("user updated successfully");
		 structure.setCode(HttpStatus.ACCEPTED.value());
		 
		return structure;	
	}
	public  ResponseStructure<String> deleteUser(@PathVariable int id) {
		Optional<User> reuser=dao.findById(id);
		ResponseStructure<String> structure = new ResponseStructure<String>();
		
		if(reuser.isPresent()) {
			structure.setBody("user found");
			structure.setMessage("user deleted successfully");
			structure.setCode(HttpStatus.FOUND.value());
		}
		else {
			structure.setBody("user not found");
			structure.setMessage("unable to deleted  record");
			structure.setCode(HttpStatus.NOT_FOUND.value());
			
		}
		return structure;
	}
  public ResponseStructure<List<User>>findAllUser(){
	  ResponseStructure<List<User>>structure=new ResponseStructure<List<User>>();
	  structure.setBody(dao.findAll());
	  structure.setMessage("list of users");
	  structure.setCode(HttpStatus.OK.value());
	  return structure;
  }
  public ResponseStructure<User>verifyUser(@RequestParam long phn,@RequestParam String password){
	  ResponseStructure<User>structure=new ResponseStructure<>();
	  User u=dao.verifyUser(phn, password);
	  if(u!=null) {
		  structure.setBody(u);
		  structure.setMessage("user has been verified");
		  structure.setCode(HttpStatus.FOUND.value());
		  }
	  else {
		  structure.setBody(null);
		  structure.setMessage("invalid phone or password");
		  structure.setCode(HttpStatus.NOT_FOUND.value());
	  }
	  return structure;
  }
public ResponseStructure<User> findUser(int id) {
	// TODO Auto-generated method stub
	return null;
}
	
}
