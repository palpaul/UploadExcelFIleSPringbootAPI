package com.optum.groupretiree.exception;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GroupRetireeCustomExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ExceptionInfo> handleCustomException(GroupRetireeCustomException excp){
		String exMsg = excp.getMessage();
		String exCode= "EXCP0001";
		ExceptionInfo info = new ExceptionInfo();
		info.setExcepCode(exCode);
		info.setExcepMessage(exMsg);
		
		return new ResponseEntity<ExceptionInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value = FileNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleCustomExceptionFileNotFound(GroupRetireeCustomException excp){
		String exMsg = excp.getMessage();
		String exCode= "EXCPF0002";
		ExceptionInfo info = new ExceptionInfo();
		info.setExcepCode(exCode);
		info.setExcepMessage(exMsg);
		
		return new ResponseEntity<ExceptionInfo>(info,HttpStatus.NOT_FOUND);
	}
}
