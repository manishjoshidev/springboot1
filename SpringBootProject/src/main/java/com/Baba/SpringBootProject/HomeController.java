package com.Baba.SpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Baba.SpringBootProject.dto.User;

@RestController

public class HomeController {
@GetMapping("/hii")
	public String test()
	{
		return ("hello from home");
		
	}
@GetMapping("/sum")
	public String getSum(@RequestParam int n1,@RequestParam int n2)
{
	return("the sum is"+(n1+n2));
}
@GetMapping("/prod/{a}/{b}")
public String getProduct(@PathVariable(name="a")int n1,@PathVariable(name="b")int n2) {
return "the product is" + n1*n2;
}
@Autowired
@PostMapping("/print")
public String printdetails(@RequestBody User user) {
	 System.out.println("firstName"+((User) user).getFn());
	 System.out.println("LastName"+((User) user).getLn());
	 System.out.println("Email"+((User) user).getEmail());
	 System.out.println("gender"+((User) user).getGender());
	 System.out.println("phone"+((User) user).getPhone());
	System.out.println("age"+((User) user).getAge());
	 
	return "details printed sucessfully";
}
}
