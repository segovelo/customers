package com.segovelo.customers.constants;

/** 
* 6 Dec 2023
* @Javadoc TODO 
*
* @author Segovelo  **/

public class CustomersConstants {
	
	private CustomersConstants() {
		throw new IllegalAccessError("Constants class: Cannot be instantiated");
	}

	public final static String CUST_SAVE_ENDPOINT = "/customers/save";
	public final static String CUST_RETRIEVE_ENDPOINT = "/customers/retrieve";
	public static final String JSON_ISO_DATE_FORMAT = "yyyy-MM-dd' T 'HH:mm:ss.SSSXXX";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_TYPE_VALUE = "application/json; charset=UTF-8";
	public static final String AUTHORIZATION = "Authorization";
	public static final String ACCEPT = "Accept";
	public static final String CORRELATION_ID = "Correlation-ID";
	public static final String X_CORRELATION_ID = "x-correlation-id";
	public static final String STATUS = "status";


}
