package br.com.movies.common.exception;

import lombok.Getter;
import lombok.Setter;

public class BussinessException extends Exception {

	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private String[] arguments;
	
	public BussinessException(String message, Throwable ex) {
		super(message, ex);
	}
	
	public BussinessException(String message, String[] arguments , Throwable ex) {
		super(message, ex);
		this.arguments = arguments;
	}
}
