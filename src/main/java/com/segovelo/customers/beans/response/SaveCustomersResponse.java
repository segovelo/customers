package com.segovelo.customers.beans.response;

import org.springframework.http.HttpStatus;

/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/

public class SaveCustomersResponse {
	
	private String message;
	private HttpStatus status;
	public String getMessage() {
		return message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public SaveCustomersResponse(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}
}
