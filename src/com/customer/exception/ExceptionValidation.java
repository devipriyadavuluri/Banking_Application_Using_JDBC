package com.customer.exception;

public class ExceptionValidation extends RuntimeException {
	private String ExceptionMessage;
	public ExceptionValidation()
	{
		
	}
	public ExceptionValidation(String exceptionMessage) {
		super();
		ExceptionMessage = exceptionMessage;
	}
	public String getExceptionMessage() {
		return ExceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		ExceptionMessage = exceptionMessage;
	}
	@Override
	public String toString() {
		return "ExceptionValidation [ExceptionMessage=" + ExceptionMessage + "]";
	}
	

}
