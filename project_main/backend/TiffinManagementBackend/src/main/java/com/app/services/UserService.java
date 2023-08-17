package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.dtos.DtoEntityConverter;
import com.app.dtos.UserDto;
import com.app.entities.User;

@Transactional
@Service
public class UserService {
    
	@Autowired
	private UserDao userDao;
	@Autowired
	private DtoEntityConverter converter;
	
	public UserDto findUserById(int userId) {
		User user = userDao.findByUserId(userId);
		
		return converter.toUserDto(user);
	}
}
