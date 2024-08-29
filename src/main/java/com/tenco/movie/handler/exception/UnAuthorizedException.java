package com.tenco.movie.handler.exception;

import org.springframework.http.HttpStatus;

public class UnAuthorizedException extends RuntimeException {
	
	private HttpStatus status;
	
	// throw new UnAuthorizedException( , )
	public UnAuthorizedException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
}
