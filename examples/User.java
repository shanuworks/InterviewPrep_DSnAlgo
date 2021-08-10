package com.learning.examples;

public class User implements Comparable<User> {
	
	static int count = 0;
	
	int id;	
	String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(User user) {
		count++;
		System.out.println(count + " call");
		System.out.println("Current object :: "+this +" Passed Object :"+user);
		return id - user.id;		
	}
	
	

}
