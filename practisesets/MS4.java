package com.google.practisesets;

import java.util.ArrayList;
import java.util.List;

public class MS4 {

	public static void main(String[] args) {
		MS4 ms = new MS4();
		ms.getDetails();
	}
	public void getDetails() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("A")) {
				list.remove("A");
			}
		}
		System.out.print(list);
	}
}
