package org.banco.consumer.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.banco.consumer.dtos.RegisterDto;
import org.banco.consumer.entities.CustomerEntity;
import org.banco.consumer.entities.CustomerLoginEntity;
import org.banco.consumer.repositories.CustomerLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;
	
	public void saveCustomer(RegisterDto registerDto) throws ParseException {
		
		CustomerLoginEntity loginEntity = new CustomerLoginEntity();
		loginEntity.setUserName(registerDto.getUsername());
		loginEntity.setPassword(DigestUtils.sha256Hex(registerDto.getPassword()));
		loginEntity.setCreatedAt(new Date());
		loginEntity.setUpdatedAt(new Date());
		
		CustomerEntity customer = new CustomerEntity();
		customer.setFirstName(registerDto.getFirstname());
		customer.setLastName(registerDto.getLastname());
		customer.setAddress(registerDto.getAddress());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date  dob = (Date) sdf.parse(registerDto.getDob());
		
		customer.setDob(dob);
		customer.setEmail(registerDto.getEmail());
		customer.setPhone((int)registerDto.getPhone());
		customer.setGender(registerDto.getGender());
		
		loginEntity.setCustomer(customer);
		
		customerLoginRepository.save(loginEntity);
		
	}
}
