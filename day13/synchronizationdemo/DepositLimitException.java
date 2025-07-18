package com.day13.synchronizationdemo;

public class DepositLimitException extends Exception{

	public DepositLimitException(){
		super("Daily limit of deposit is exceed...");
	}
	public DepositLimitException(String message) {
		super(message);
	}
	
}
