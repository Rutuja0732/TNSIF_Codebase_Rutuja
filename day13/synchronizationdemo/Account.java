package com.day13.synchronizationdemo;

public class Account implements Bank{
	
	private int Accno;
	private String name;
	private double Balance;
	
	public Account(int accno, String name, double balance) {
		super();
		Accno = accno;
		this.name = name;
		Balance = balance;
	}
	
	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) {
		Accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [Accno=" + Accno + ", name=" + name + ", Balance=" + Balance + "]";
	}

	@Override
	public void deposit(int amt) throws DepositLimitException {
		if(amt>25000)
			throw new DepositLimitException("Daily limit exceed");
		else {
			Balance=Balance+amt;
			System.out.println("Amount Deposited.. "+amt);
		}
		
	}

	@Override
	public synchronized void withdraw(int amt) throws InsufficientBalanceException {
		if(Balance-amt<MINBAL)
			throw new InsufficientBalanceException();
		else {
			Balance=Balance-amt;
			System.out.println("After withdrawing Rs:"+amt+"Current balance"+Balance);
		}
		
	}
	
	
	

}
