package org.banco.consumer.services;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.banco.consumer.dtos.CustomerDto;
import org.banco.consumer.entities.CustomerLoginEntity;
import org.banco.consumer.repositories.CustomerLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;
	
	public CustomerDto login(String username, String password) {
		String encryptedPassword = DigestUtils.sha256Hex(password);
		CustomerLoginEntity loginEntity = customerLoginRepository.findByUsernameAndPassword(username, encryptedPassword);
		if(loginEntity == null) {
			return null;
		} else {
			loginEntity.setLastSignedOn(new Date());
			loginEntity = customerLoginRepository.update(loginEntity);
			
			CustomerDto customer = new CustomerDto();
			customer.setId(loginEntity.getCustomer().getId());
			customer.setLastSignedOn(loginEntity.getLastSignedOn());
			customer.setName(loginEntity.getCustomer().getFirstName() + " " + loginEntity.getCustomer().getLastName());
			return customer;
		}
	}
	
	
}
