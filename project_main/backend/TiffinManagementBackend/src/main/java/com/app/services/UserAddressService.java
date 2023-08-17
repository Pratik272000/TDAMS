package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserAddressDao;
import com.app.dto.UserAddressDto;
import com.app.dtos.DtoEntityConverter;
import com.app.entities.UserAddress;

@Transactional
@Service
public class UserAddressService {
@Autowired
UserAddressDao userAddressDao;
@Autowired
DtoEntityConverter converter;

public UserAddressDto findByUserId(int id) {
	UserAddress userAddress=userAddressDao.findByUserId(id);
	if(userAddress==null)
		return null;
	return converter.toUserAddressDto(userAddress);
}

}
