package com.app.dtos;

import org.springframework.stereotype.Component;

import com.app.entities.DeliveryAddress;
import com.app.entities.Order;
import com.app.entities.TiffinDetail;
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
	public User UserDtotoUser(UserDto userdto) {
		User user = new User();
		user.setAadharNo(userdto.getAadharNo());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setPhone(userdto.getPhone());
		user.setRole(userdto.getRole());
		user.setUserName(userdto.getUserName());
		return user;
	}

	public OrderDto toOrderDto(Order entity) {
		OrderDto dto = new OrderDto();
		dto.setOrderId(entity.getOrderId());
	//	dto.setUserId(entity.getUser().getUserId());
		dto.setStartDate(entity.getStartDate());
		dto.setEndDate(entity.getEndDate());
		dto.setTotalDays(entity.getTotalDays());
		dto.setTotalAmount(entity.getTotalAmount());
		dto.setTiffinId(entity.getTiffinDetails().getTiffinId());
		return dto;
	}

	public Order userOrderToOrder(OrderDto orderdto) {
		Order order = new Order();
		order.setStartDate(orderdto.getStartDate());
		order.setEndDate(orderdto.getEndDate());
		order.setTotalAmount(orderdto.getTotalAmount());
//		order.setOrderId(userdto.getOrder_id());
		order.setUser(new User(orderdto.getUserId()));
		order.setTotalDays(orderdto.getTotalDays());
		order.setTiffinDetails(new TiffinDetail(orderdto.getTiffinId()));
		return order;
	}
}
