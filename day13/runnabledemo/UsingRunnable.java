package com.day13.runnabledemo;

public class UsingRunnable implements Runnable{

	Thread t;
	int end,start;
	String msg;
	
	
	public UsingRunnable( int end, int start, String msg) {
		super();
	
		this.end = end;
		this.start = start;
		this.msg = msg;
	}


	public void run() {
		for(int i=end;i>start;i--) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println(i+msg);
		}
	}
}
