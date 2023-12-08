package com.segovelo.customers.repository;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.segovelo.customers.beans.request.Customer;
import com.segovelo.customers.beans.request.RequestAttributes;
import com.segovelo.customers.beans.response.SaveCustomersResponse;

/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/

@Repository
public interface CustomersRepository extends MongoRepository<Customer, String>{
	
}
