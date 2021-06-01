package com.hcl.foodorder.domain.exception;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author Harishkumar Reddy
 *
 */
@Data
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

}
