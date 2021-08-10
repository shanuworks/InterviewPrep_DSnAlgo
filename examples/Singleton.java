package com.learning.examples;

class Singleton {
	
	// class level variable
	private static Singleton singleton = null;
	private String s;

// private constructor to restrict the object creation from outside the class
private Singleton() {
	System.out.println("Instanc created");
	s = "Hello, I am string part of singleton class";
 } 

public void setS(String s){
	this.s = s;
}

public String getS() {
	return s;
}

//Lazy initialization has been used
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
			
return singleton;
	}
}
