package com.segovelo.customers.service;

import org.springframework.http.HttpHeaders;

import com.segovelo.customers.beans.response.SaveCustomersResponse;
;
/** 
* 6 Dec 2023 20:30:51
* @Javadoc TODO 
*
* @author Segovelo  **/

public interface CustomersService {
	public SaveCustomersResponse saveCustomers(HttpHeaders httpHeaders);

}
