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
* 6 Dec 2023 21:54:57
* @Javadoc TODO 
*
* @author Segovelo  **/

@Repository
public interface CustomersRepository extends MongoRepository<Customer, String>{
	
	//public SaveCustomersResponse saveCustomers(RequestAttributes requestBody, HttpHeaders httpHeaders);

	//public Optional<Customer> findById(@Param("customerRef") String customerRef);
}
