package com.app.dtos;

import org.springframework.stereotype.Component;

import com.app.entities.DeliveryAddress;
import com.app.entities.User;
import com.app.entities.UserAddress;

@Component
public class DtoEntityConverter {
       
	public UserDto toUserDto(User entity) {
		UserDto dto = new UserDto();
		dto.setUserId(entity.getUserId());
		dto.setUserName(entity.getUserName());
		dto.setEmail(entity.getEmail());
		dto.setPassword(entity.getPassword());
		dto.setAadharNo(entity.getAadharNo());
		dto.setPhone(entity.getPhone());
		dto.setRole(entity.getRole());
		return dto;
	}
	
	public UserAddressDto toUserAddressDto(UserAddress entity) {
		UserAddressDto dto = new UserAddressDto();
		dto.setAddressId(entity.getAddressId());
		dto.setAddressLine(entity.getAddressLine());
		dto.setLocationId(entity.getDeliveryAddress().getLocationId());
		dto.setUserId(entity.getUserId());
		return dto;
	}
	public UserAddress toUserAddress(UserAddressDto dto) {
		UserAddress entity = new UserAddress();
		entity.setAddressId(dto.getAddressId());
		entity.setAddressLine(dto.getAddressLine());
		entity.setUserId(dto.getUserId());
		
		DeliveryAddress del = new DeliveryAddress();
		del.setLocationId(dto.getLocationId());
		entity.setDeliveryAddress(del);
		return entity;
	}
}