package com.segovelo.customers.beans.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestAttributes {
	
	@JsonProperty("customers")
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	@Override
	public String toString() {
		StringBuffer customersString = new StringBuffer();
		for(Customer customer : customers) {
			customersString.append(customer.toString());
			customersString.append(", ");
		}
		return "Customers [customers = " + customersString.toString() + "]";
	}
}
