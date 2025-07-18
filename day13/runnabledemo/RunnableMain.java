package com.day13.runnabledemo;

public class RunnableMain {
	
	public static void main(String[] args) {
		
		Runnable r=new UsingRunnable( 1, 5, "hi");
		
		Thread t=new Thread();
		t.start();
	}

}
