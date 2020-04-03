package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody HttpStatus addNewUser (@RequestParam String name
			, @RequestParam String passwd) {
		User tmp = userRepository.findByLogin(name);
		if(tmp == null) {
			User n = new User();
			n.setLogin(name);
			n.setPasswd(passwd);
			userRepository.save(n);
			return HttpStatus.CREATED;
		}
		return HttpStatus.UNAUTHORIZED;
	}

	@GetMapping(path = "/getConnection")
	public @ResponseBody User getUserByLoginAndPasswd(@RequestParam String login, @RequestParam String passwd) {
		User user =  userRepository.findByLoginAndPasswd(login, passwd);
		if(user == null) {
			return new User();
		}
		return user;
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
}
