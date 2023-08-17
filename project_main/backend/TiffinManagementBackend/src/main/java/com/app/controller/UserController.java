package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dtos.Response;
import com.app.dtos.UserDto;
import com.app.entities.User;
import com.app.services.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	  @Autowired
      private UserService userService;
	  
	  @GetMapping("/{id}")
	  public ResponseEntity<?> displayUserById(@PathVariable("id") int id ){
		  UserDto userDto = userService.findUserById(id);
		  return Response.success(userDto);
	  }
	  
	  
}
