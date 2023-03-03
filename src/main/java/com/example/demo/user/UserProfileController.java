package com.example.demo.user;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.service.UserProfileMapper;

@CrossOrigin(origins = {"*"})
@RestController
public class UserProfileController {

	public UserProfileMapper mapper;
	
	public UserProfileController(UserProfileMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/user/{id}")
	public UserProfile getUserProfile(@PathVariable("id") int id) {
		return mapper.getUserProfile(id);
	}

	@GetMapping("/user/all")
	public List<UserProfile> getUserProfileList() {
		return mapper.getUserProfileList();
	}
	
	@PutMapping("/user/{id}")
	public void putUserProfile(@PathVariable("id") int id, @RequestParam("userId") String userId, @RequestParam("password") String password, 
			@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("nickName") String nickName) {
		mapper.insertUserProfile(id, userId, password, name, phone, nickName);
	}
	
	@PostMapping("/user/{id}")
	public void postUserProfile(@PathVariable("id") int id, @RequestParam("userId") String userId, @RequestParam("password") String password, 
			@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("nickName") String nickName) {
		mapper.updateUserProfile(id, userId, password, name, phone, nickName);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserProfile(@PathVariable("id") int id) {
		mapper.deleteUserProfile(id);
	}
}
