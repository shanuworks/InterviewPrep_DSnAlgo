package com.learning.examples;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1.getS());
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.getS());
		
		Singleton singleton3 = Singleton.getInstance();
		singleton3.setS("Modified from main class");
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
		
		System.out.println(singleton1.getS());
		System.out.println(singleton2.getS());
		System.out.println(singleton3.getS()); */
		
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				Singleton singleton = Singleton.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				Singleton singleton = Singleton.getInstance();
			}
		});
		t1.start();
		t2.start();

	}
}
