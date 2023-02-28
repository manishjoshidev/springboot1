package org.jsp.bootproject.dao;

import java.util.List;
import java.util.Optional;
import org.jsp.bootproject.Repository.userRepository;
import org.jsp.bootproject.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDao {             

	 @Autowired
	   	userRepository repository;
	 
	 public User saveUser(User user) {
		 return repository.save(user);
		 
	 }
	 public User updateUser(User user) {
		 return repository.save(user);
		 
	 }
	 public Optional<User>findById(int id){
		 return repository.findById(id);
		 
	 }
	 public List<User>findAll(){
		 return repository.findAll() ;
		 }
	 public void deleteById(int id) {
		 repository.deleteById(id);
	 }

	 public User verifyUser(long phone,String password) {
		 return repository.verifyUser(phone,password);
	 }

}
