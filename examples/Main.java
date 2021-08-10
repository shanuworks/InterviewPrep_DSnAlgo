package com.learning.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) {
		/*
		User u = new User(123, "Shanu");
		User u1 = null;
		System.out.println(String.valueOf(u1 != null ? u1.getId() : null));
		
		List<User> uList = new ArrayList<User>();
		uList.add(u);
		uList.add(u1);
		
		for(User user : uList) {
			System.out.println(user.getId());
			System.out.println(user.getName());
		}
		*/
		HashSet hs = new HashSet<Integer>();
		// HashSet<Object> hs1 = new HashSet<Integer>(); Not allowed
		//hs1.add("shanu");

		hs.add("shanu");
		
		System.out.println(hs);

		HashSet<String> hs2 = new HashSet<>();

		hs2.add("Shanu");
		hs2.add(new String("Shanu"));
		
		System.out.println("Size:: "+hs2.size()); // 1 both are equal
		
		/*
		ch ch1 = new ch();
		//ch1.print();
		User u = new User(1,"shanu");
		User u1 = new User(2,"sh");
		List<User> list = new ArrayList<User>();
		list.add(u);
		list.add(u1);
		
		Iterator<User> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add(new User(3,"mony"));
		}
		*/
		int[] arr= {3,2,1};
		Arrays.sort(arr);
		TreeMap tm = new TreeMap();
	}

}
class Parent {
	static {
		System.out.println("Parent static");
	}
	{
		System.out.println("Parent ini");
	}
	public Parent() {
		System.out.println("P Cons");
	}
	public void print() {
		System.out.println("Print 1");
	}
}
class Child extends Parent {
	static {
		System.out.println("ch static");
	}
	{
		System.out.println("ch ini");
	}
	public Child() {
		System.out.println("ch Cons");
	}
	public void print() {
		System.out.println("Print 2");
	}
}
class ch extends Child {
	public void print() {
		super.print();
		System.out.println("Print 3");
	}
}