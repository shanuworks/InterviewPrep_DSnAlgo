package com.learning.examples;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> e = new HashSet<Employee>();
		 Employee e1 = new Employee(1,"Shanu");
		 Employee e2 = new Employee(2,"Shanu");
		 Employee e3 = new Employee(1,"Shanu");
		 Employee e4 = new Employee(4,"Shanu");
		 
		 e.add(e1);
		 e.add(e2);
		 e.add(e3);
		 e.add(e4);
		 
		 System.out.println(e);
		 

	}

}
