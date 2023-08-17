package com.app.dtos;

import org.springframework.stereotype.Component;

import com.app.entities.User;

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
}
