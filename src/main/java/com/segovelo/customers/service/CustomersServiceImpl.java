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
import com.segovelo.customers.beans.response.RetrieveCustomerResponse;
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
		logger.debug("Inside service.saveCustomers");
		List<Customer> customers = requestBody.getCustomers();
		List<Customer> savedCustomers = null;
		try {
			 savedCustomers = repository.insert(customers);
		} catch(DuplicateKeyException exception) {
			logger.error("Duplicated Key Error - {}", exception.getMessage());
		}
		if (null != savedCustomers && customers.size() == savedCustomers.size()) {
			logger.debug("{} customers saved successfully to DB", String.valueOf(customers.size()));
			return new SaveCustomersResponse(String.format("%s customers saved to DB", String.valueOf(customers.size())), HttpStatus.CREATED);
		}
		else {
			logger.debug("Insertion into DB Failed!");
			return new SaveCustomersResponse("Insertion into DB Failed!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	public RetrieveCustomerResponse retrieveCustomer(String customerRef, HttpHeaders httpHeaders) {
		logger.debug("Inside service.retrieveCustomer");
		RetrieveCustomerResponse retrieveCustomerResponse = new RetrieveCustomerResponse();
		Optional<Customer> customerOptional = repository.findById(customerRef);
		if(customerOptional.isPresent()) {
			logger.debug("Customer with ref {} was found", customerRef);
			retrieveCustomerResponse.setStatus(HttpStatus.OK);
			retrieveCustomerResponse.setMessage(String.format("Customer with ref %s  was found", customerRef));
			retrieveCustomerResponse.setCustomer(customerOptional.get());
		} else {
			logger.debug("Customer with ref {} was NOT found", customerRef);
			retrieveCustomerResponse.setStatus(HttpStatus.NOT_FOUND);
			retrieveCustomerResponse.setMessage(String.format("Customer with ref %s was NOT found", customerRef));			
		}
	    return retrieveCustomerResponse;
	}

}
