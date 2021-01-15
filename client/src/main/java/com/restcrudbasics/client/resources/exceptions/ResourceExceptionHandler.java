package com.restcrudbasics.client.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.restcrudbasics.client.services.exceptions.EntityNotFoundException;

@ControllerAdvice // intercept the error that occur in the resource layer
public class ResourceExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class) // every time a error EntityNotFoundException occur, the error will be treat with the ResponseEntity Method 
	public ResponseEntity<StandardError> entityNotFound(EntityNotFoundException e, HttpServletRequest request){ //this method recive the exception and the information of the Http request
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setError("Resource not found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
}
