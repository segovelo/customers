package com.segovelo.customers.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.segovelo.customers.beans.request.Customer;
import com.segovelo.customers.beans.request.RequestAttributes;
import com.segovelo.customers.beans.response.RetrieveCustomerResponse;
import com.segovelo.customers.beans.response.SaveCustomersResponse;
import com.segovelo.customers.service.CustomersService;
import static com.segovelo.customers.constants.CustomersConstants.CUST_RETRIEVE_ENDPOINT;
import static com.segovelo.customers.constants.CustomersConstants.CUST_SAVE_ENDPOINT;
import static com.segovelo.customers.constants.CustomersConstants.CONTENT_TYPE_VALUE;
/** 
* 6 Dec 2023 
* @Javadoc TODO 
*
* @author Segovelo  **/

@RestController
public class CustomersController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomersController.class);
	
	@Autowired
	private CustomersService service;
	
	@PostMapping(value = CUST_SAVE_ENDPOINT, produces = CONTENT_TYPE_VALUE)
	public SaveCustomersResponse saveCustomers(@RequestBody RequestAttributes requestBody, @RequestHeader HttpHeaders requestHeaders) throws Exception {
	    logger.debug("Inside controller.saveCustomers");
	    logger.debug("Request body: {}", requestBody.toString());
		SaveCustomersResponse saveCustomersResponse = service.saveCustomers(requestBody, requestHeaders);
	    logger.debug("Returning response : {}", saveCustomersResponse.toString());
		return saveCustomersResponse;
	}
	
	@GetMapping(value = CUST_RETRIEVE_ENDPOINT, produces = CONTENT_TYPE_VALUE)
	public ResponseEntity<Customer> retrieveCustomer(@RequestParam(value="customersRef", required=true) String customerRef, 
			@RequestHeader HttpHeaders requestHeaders) throws Exception {
	    logger.debug("Inside controller.retrieveCustomers");
	    logger.debug("Retrieve customer with customerRef: {}", customerRef);
		Customer customerResponse = service.retrieveCustomer(customerRef, requestHeaders);
	    logger.debug("Returning response : {}", customerResponse.toString());	    
		return new ResponseEntity<>(customerResponse, HttpStatus.OK);
	}

}
