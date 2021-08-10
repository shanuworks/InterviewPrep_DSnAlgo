package com.google.practisesets;

public class MS3 implements Runnable{
	
	public static void main(String[] args) {
		new Thread(new MS3("Wallace")).start();
		new Thread(new MS3("Gromit")).start();
	}
	
	private String name;
	public MS3(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		message(1);
		message(2);
		
	}
	
	private synchronized void message(int n) {
		System.out.print(name +"-"+n+" ");
	}
}
