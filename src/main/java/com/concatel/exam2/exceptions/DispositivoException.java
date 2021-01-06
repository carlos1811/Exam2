package com.concatel.exam2.exceptions;

public class DispositivoException  extends Exception {

	
	private static final long serialVersionUID = 1L;

	private final String code ;


	public DispositivoException(String code, String message) {
		super(message);
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	
}
