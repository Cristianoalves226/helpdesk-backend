package com.cristiano.helpdesk.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cristiano.helpdesk.services.execptions.DataIntegrityViolationException;
import com.cristiano.helpdesk.services.execptions.ObjetcNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjetcNotFoundException.class)
	public ResponseEntity<StandardError> objectnotFoundException(ObjetcNotFoundException ex,HttpServletRequest request) {
		
		
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
				"Object Not Found", ex.getMessage(), request.getRequestURI());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<StandardError> dataIntegrityViolationException(DataIntegrityViolationException ex,HttpServletRequest request) {
		
		
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(),
				"Violação de dados ", ex.getMessage(), request.getRequestURI());
		
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
