package com.app.dtos;

import org.springframework.stereotype.Component;

import com.app.dto.UserAddressDto;
import com.app.entities.User;
import com.app.entities.UserAddress;
@Component
public class DtoEntityConverter {

	public UserDto toUserDto(User entity) {
	UserDto dto=new UserDto();
	dto.setUserId(entity.getUserId());
	dto.setUserName(entity.getUserName());
	dto.setEmail(entity.getEmail());
	dto.setPassword(entity.getPassword());
	dto.setAadharNo(entity.getAadharNo());
	dto.setPhone(entity.getPhone());
	dto.setRole(entity.getRole());
	return dto;
}

	public UserAddressDto toUserAddressDto(UserAddress userAddress) {
		UserAddressDto dto=new UserAddressDto();
		dto.setAddressId(userAddress.getAddressId());
		dto.setAddressLine(userAddress.getAddressLine());
		dto.setLocationId(userAddress.getDeliveryAddress().getLocationId());
		dto.setUserId(userAddress.getUserId());
		return dto;
	}
}
