package com.segovelo.customers.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.segovelo.customers.beans.request.Customer;
import com.segovelo.customers.beans.request.RequestAttributes;
import com.segovelo.customers.beans.response.RetrieveCustomersResponse;
import com.segovelo.customers.beans.response.SaveCustomersResponse;
import com.segovelo.customers.repository.CustomersRepository;
import  org.springframework.dao.DuplicateKeyException;
/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/
@Service
public class CustomersServiceImpl implements CustomersService {

	private static final Logger logger = LoggerFactory.getLogger(CustomersServiceImpl.class);
	@Autowired
	private CustomersRepository repository;
	
	@Override
	public SaveCustomersResponse saveCustomers(RequestAttributes requestBody, HttpHeaders httpHeaders) {
		List<Customer> customers = requestBody.getCustomers();
		List<Customer> savedCustomers = null;
		try {
			 savedCustomers = repository.insert(customers);
		} catch(DuplicateKeyException exception) {
			logger.error("Duplicated Key Error - {}", exception.getMessage());
		}
		if (null != savedCustomers && customers.size() == savedCustomers.size()) {
			return new SaveCustomersResponse(String.format("%s customers saved to DB", String.valueOf(customers.size())), HttpStatus.CREATED);
		}
		else {
			return new SaveCustomersResponse("Insertion into DB Failed!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	public Customer retrieveCustomer(String customerRef, HttpHeaders httpHeaders) {
		
		Optional<Customer> customerOptional = repository.findById(customerRef);
		if(customerOptional.isPresent()) {
			return customerOptional.get();
		} else {
			return null;
		}
	
	}

}
