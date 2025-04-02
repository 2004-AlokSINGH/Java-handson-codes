package com.alok.day8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo implements Runnable {
	
	private String name;
	
	

	public ThreadDemo(String name) {
		super();
		this.name = name;
	}



	@Override
	public void run() {


		System.out.println(name+"is ecxcuted");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e
					);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(int c=0;c<10;c++) {
			System.err.println();
			
		}
	}

}

