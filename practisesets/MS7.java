package com.google.practisesets;

import java.util.Arrays;

public class MS7 {
	String str="a";
	
	void A() {
		try {
			str +="b";
			B();
		}catch(Exception e) {
			str += "c";
		}
	}
	
	void B() throws Exception{
		try {
			str +="d";
			C();
		}catch(Exception e) {
			throw new Exception();
		} 
		finally{
			str +="e";
		}
		str +="f";
	}
	
	void C() throws Exception{	
			throw new Exception();
	}
	
	void display(){
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		MS7 ms = new MS7();
		ms.A();
		ms.display();
	}
}
