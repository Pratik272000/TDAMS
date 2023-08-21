package com.app.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DeliveryAddressDao;
import com.app.dtos.DeliveryAddressDto;
import com.app.dtos.DtoEntityConverter;
import com.app.entities.DeliveryAddress;

@Transactional
@Service
public class DeliveryAddressService {
    @Autowired
	DeliveryAddressDao deliveryAddressDao;
    
    @Autowired
    DtoEntityConverter converter;
    
	public DeliveryAddressDto findByLocationId(int id) {
	    DeliveryAddress deliveryAddress = deliveryAddressDao.findByLocationId(id);
	    
		return converter.toDeliveryAddressDto(deliveryAddress);
	}

	public Map<String, Object> addDeliveryAddress(DeliveryAddressDto dto) {
		DeliveryAddress entity = converter.toDeliveryAddress(dto);
		entity = deliveryAddressDao.save(entity);
		
		return Collections.singletonMap("Inserted", entity.getLocationId());
	}

	public List<DeliveryAddressDto> findAll() {
		List<DeliveryAddress> list = deliveryAddressDao.findAll();
		List<DeliveryAddressDto> dtolist = new ArrayList<>();
		for(DeliveryAddress dto : list) {
			DeliveryAddressDto dtoAdd = converter.toDeliveryAddressDto(dto); 
			dtolist.add(dtoAdd);
		}
		return dtolist;
	}

}
