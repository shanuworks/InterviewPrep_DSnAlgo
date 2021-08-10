package com.learning.examples;

import java.util.HashSet;
import java.util.Set;

public class TestProgram {

	public static void main(String[] args) {
		int x= 1;
		switch(x){
		case 1: {
			System.out.println("1");
			
		}
		
		case 2: {
			System.out.println("2"); 
			break;
		}
		
		case 3: System.out.println("3");
		case 4: System.out.println("4");
		
		}
		
		String s= "";
		System.out.println("Length :"+ s.length());
		
		
		Set set = new HashSet();
		set.add("shanu");
		set.add("kundan");
		set.add("shanu");
		set.add("kundan");
		set.add("mony");
		set.add("nitin");
		
		System.out.println(set);
		
		
			User u = new User(1, "shanu");
			System.out.println(u);
			
			changeObject(u);
			System.out.println(u);
			
			u.setName(null);
			if(u.getName()!= null) {
				System.out.println("Empty");
			}
			
			//String st = null;
			//sSystem.out.println(st.length());
		
		Long customerId = null;
		printCustomerId(customerId);
			
	}
	public static void changeObject(User u ) {
		u.setId(2);
	}
	
	public static void printCustomerId(long customerId) {
		System.out.println(customerId);
	}
}
