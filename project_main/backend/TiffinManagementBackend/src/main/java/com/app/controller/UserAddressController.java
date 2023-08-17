package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserAddressDto;
import com.app.dtos.Response;
import com.app.services.UserAddressService;

@CrossOrigin(origins = "*")
@RestController
public class UserAddressController {
@Autowired
UserAddressService userAddressService;
@GetMapping("/user/userAddress/{id}")
public ResponseEntity<?> displayUserAddressByUserId(@PathVariable("id") int id ){
	System.out.println(id);
	UserAddressDto userAddressDto=userAddressService.findByUserId(id);
	if(userAddressDto==null)
		return Response.error("Please add Address");
	return Response.success(userAddressDto);
}
}
