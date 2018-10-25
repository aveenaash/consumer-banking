package org.banco.consumer.services;

import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.banco.consumer.dtos.AccountDto;
import org.banco.consumer.entities.AccountEntity;
import org.banco.consumer.entities.CustomerEntity;
import org.banco.consumer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void saveAccount(AccountDto accountDto) {
		
		CustomerEntity customer = customerRepository.findById(accountDto.getCustomerId());
		
		AccountEntity accountEntity = new AccountEntity();
		Long randomAccountNumber = Long.parseLong(RandomStringUtils.randomNumeric(12));
		accountEntity.setAccountNumber(randomAccountNumber);
		accountEntity.setAccountType(accountDto.getAccountType());
		accountEntity.setBalance(accountDto.getBalance());
		accountEntity.setCreatedAt(new Date());
		accountEntity.setUpdatedAt(new Date());
		
		customer.getAccounts().add(accountEntity);
		
		customerRepository.update(customer);
	}
	
}
