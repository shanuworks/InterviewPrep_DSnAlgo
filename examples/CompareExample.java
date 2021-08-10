package com.learning.examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareExample {
	
	public static void main(String args[]) {
		
		// Example 1 Sorting custom objects
		
		User shanu = new User(3, "shanu");
		User sonam = new User(5, "sonam");
		User mony = new User(2, "mony");		
		User nitin = new User(4, "nitin");
		User sony = new User(1, "sony");
	
		List<User> userList = new ArrayList<User>(); 
		userList.add(shanu);
		userList.add(sonam);
		userList.add(mony);
		userList.add(nitin);
		userList.add(sony);
		
		for(User u : userList) {
			System.out.println("User :: "+u.id +"Name ::"+u.name);
		}
		
		Collections.sort(userList);
		
		for(User u : userList) {
			System.out.println("User :: "+u.id +"Name ::"+u.name);
		}
		
		// Example 2 Sorting primitives
		
		Integer i[] = new Integer[] {40,90,30,10,80,44,32,1};
		
		Arrays.sort(i);
		
		System.out.println(i.toString());
		
		
		
	}

}
