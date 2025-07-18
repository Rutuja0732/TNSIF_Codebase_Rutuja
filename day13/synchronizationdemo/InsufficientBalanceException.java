package com.day13.synchronizationdemo;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException() {
		super("Insufficient balance exception   ");
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
