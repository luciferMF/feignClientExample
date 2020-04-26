package org.websparrow.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.websparrow.exception.CustomException;
import org.websparrow.modal.ErrorResponse;

import feign.FeignException;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorResponse> customException(CustomException exception, WebRequest request) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(exception.getMessage(),
				exception.getMessage(), new Date(), request.getContextPath()));
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(FeignException.class)
	public ResponseEntity<ErrorResponse> feignException(FeignException exception, WebRequest request) {
		System.out.println("Feign Exception");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(exception.getMessage(),
				exception.getMessage(), new Date(), request.getContextPath()));
	}
}
