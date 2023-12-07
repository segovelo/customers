package com.segovelo.customers.service;

import org.springframework.http.HttpHeaders;

import com.segovelo.customers.beans.request.Customer;
import com.segovelo.customers.beans.request.RequestAttributes;
import com.segovelo.customers.beans.response.RetrieveCustomerResponse;
import com.segovelo.customers.beans.response.SaveCustomersResponse;
;
/** 
* 6 Dec 2023 20:30:51
* @Javadoc TODO 
*
* @author Segovelo  **/

public interface CustomersService {
	public SaveCustomersResponse saveCustomers(RequestAttributes requestBody, HttpHeaders httpHeaders);
	
	public Customer retrieveCustomer(String customerRef, HttpHeaders httpHeaders);
}
