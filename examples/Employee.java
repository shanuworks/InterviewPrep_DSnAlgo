package com.learning.examples;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class Employee {
	private int id;
	private String name;
		
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [ id : "+id+" , name : "+name+" ]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return e.id == this.id;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int hash = new HashCodeBuilder(id%2==0?id+1:id, PRIME).toHashCode();
        return hash;
		
	}

}
