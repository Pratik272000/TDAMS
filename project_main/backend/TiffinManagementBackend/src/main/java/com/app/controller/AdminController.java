package com.app.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dtos.Response;
import com.app.dtos.UserDto;
import com.app.entities.User;
import com.app.services.DaywiseOrderService;
import com.app.services.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {
@Autowired(required = true)
private ModelMapper mapper;
@Autowired 
private UserService userService;
@Autowired
private DaywiseOrderService daywiseOrderService;
@GetMapping("/DeliveryBoys")
public ResponseEntity<?> findalldeliveryBoys(){
	return Response.success(userService.DeliveryBoysList());
}
@DeleteMapping("/DeliveryBoys/Delete/{userId}")
public ResponseEntity<?> deleteDeliveryboy(@PathVariable ("userId")int userId){
	System.out.println("userId  :"+userId);
	User deletedUser=userService.DeleteUser(userId);
	System.out.println(deletedUser);
	UserDto deletedDto=mapper.map(deletedUser,UserDto.class);
	return Response.success(deletedDto);
	
}

@DeleteMapping("/customer/Delete/{userId}")
public ResponseEntity<?> deleteCustomer(@PathVariable("userId") int userId) {
	System.out.println("userId : " + userId);
	User deletedUser = userService.DeleteUser(userId);
	System.out.println(deletedUser);
	UserDto deletedUDto = mapper.map(deletedUser, UserDto.class);
	return Response.success(deletedUDto);
}
@GetMapping("/CustomerList")
public ResponseEntity<?> getAllCustomers(){
	return Response.success(userService.getAllCustomers());
}
@GetMapping("/ActiveCutomer")
public ResponseEntity<?> ActiveCustomerList(){
	return Response.success(daywiseOrderService.getAllActiveUsers());
}
}
