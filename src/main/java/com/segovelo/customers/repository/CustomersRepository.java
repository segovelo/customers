package com.segovelo.customers.repository;

import org.springframework.http.HttpHeaders;

import com.segovelo.customers.beans.request.RequestAttributes;
import com.segovelo.customers.beans.response.SaveCustomersResponse;

/** 
* 6 Dec 2023 21:54:57
* @Javadoc TODO 
*
* @author Segovelo  **/

public interface CustomersRepository {
	
	public SaveCustomersResponse saveCustomers(RequestAttributes requestBody, HttpHeaders httpHeaders);

}
