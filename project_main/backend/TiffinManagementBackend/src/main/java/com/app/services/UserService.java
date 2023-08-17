package com.app.services;

import java.util.Collections;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public UserDto findUserById(int id) {
		// TODO Auto-generated method stub
		User user= userDao.findByUserId(id);
		return converter.toUserDto(user);
		
		
	}

	public Map<String,Object> editUser(int userId, UserDto dto) {

		User user=userDao.findByUserId(userId);
		user.setAadharNo(dto.getAadharNo());
		user.setEmail(dto.getEmail());
		user.setPhone(dto.getPhone());
		user.setRole(dto.getRole());
		user.setUserName(dto.getUserName());
		user=userDao.save(user);
		return Collections.singletonMap("userChanged",1);
	}

}
