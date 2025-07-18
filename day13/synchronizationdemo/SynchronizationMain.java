package com.day13.synchronizationdemo;

public class SynchronizationMain {
	
	public static void main(String[] args) throws InsufficientBalanceException {
		Account jyoti=new Account(100, "jyoti", 45000);
		System.out.println(jyoti);
		
		AccountThread t[]=new AccountThread[10];
		for(int i=0;i<10;i++) {
			t[i]=new AccountThread(jyoti, 1000*(i+1));
		}
		
		try {
			for(int i=0;i<10;i++) {
				t[i].join();
			}
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(jyoti);
	}

}
