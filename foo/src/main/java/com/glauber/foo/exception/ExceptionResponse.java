package com.glauber.foo.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	
	
}
