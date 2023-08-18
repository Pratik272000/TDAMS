package com.app.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.OrderDao;
import com.app.dtos.DtoEntityConverter;
import com.app.dtos.OrderDto;
import com.app.entities.Order;

@Transactional
@Service
public class OrderService {
	@Autowired
	OrderDao orderDao;
	@Autowired
	DtoEntityConverter converter;

	public OrderDto findOrderById(int id) {
		Order order = orderDao.findByOrderId(id);
		return converter.toOrderDto(order);
	}

	public OrderDto AddOrder(OrderDto userDto) {
        Order order=converter.userOrderToOrder(userDto);
		order =orderDao.save(order);
		return converter.toOrderDto(order);
	}

}
