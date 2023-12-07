package com.segovelo.customers.service;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.segovelo.customers.beans.request.RequestAttributes;
import com.segovelo.customers.beans.response.RetrieveCustomerResponse;
import com.segovelo.customers.beans.response.SaveCustomersResponse;

/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/
@Service
public class CustomersServiceImpl implements CustomersService {

	@Override
	public SaveCustomersResponse saveCustomers(RequestAttributes requestBody, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public RetrieveCustomerResponse retrieveCustomer(String customerRef, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return null;

	}

}
