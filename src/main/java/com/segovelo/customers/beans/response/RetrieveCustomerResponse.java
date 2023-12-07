package com.segovelo.customers.beans.response;

import java.util.List;

import com.segovelo.customers.beans.request.Customer;

/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/

public class RetrieveCustomerResponse {
	
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
