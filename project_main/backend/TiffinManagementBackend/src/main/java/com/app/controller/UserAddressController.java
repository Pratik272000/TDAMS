package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dtos.Response;
import com.app.dtos.UserAddressDto;
import com.app.services.UserAddressService;

@CrossOrigin(origins = "*")
@RestController
public class UserAddressController {
    @Autowired 
	UserAddressService userAddressService;
    
    @PostMapping("/user/userAddress/add")
    public ResponseEntity<?> addUserAddress(@RequestBody UserAddressDto dto){
    	System.out.println(dto.getLocationId() + "sas");
    	Map<String,Object> result = userAddressService.addUserAddress(dto);
    	return Response.success(result);
    }
}
