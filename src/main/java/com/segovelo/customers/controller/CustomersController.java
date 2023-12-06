package com.segovelo.customers.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.segovelo.customers.service.CustomersService;
/** 
* 6 Dec 2023 
* @Javadoc TODO 
*
* @author Segovelo  **/

@RestController
public class CustomersController {
	
	@Autowired
	private CustomersService service;
	

}
