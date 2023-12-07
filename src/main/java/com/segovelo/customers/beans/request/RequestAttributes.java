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
	private List<CustomerRequest> customers;

	public List<CustomerRequest> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerRequest> customers) {
		this.customers = customers;
	}
	
	@Override
	public String toString() {
		StringBuffer customersString = new StringBuffer();
		for(CustomerRequest customer : customers) {
			customersString.append(customer.toString());
			customersString.append(", ");
		}
		return "ASPSPGetParticipantsResponse [participants = " + customersString.toString() + "]";
	}
}
