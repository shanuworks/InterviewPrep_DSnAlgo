package com.google.practisesets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A {
	void x();
}
class B implements A{

	@Override
	public void x() {
		
	}
	public void y() {
		
	}
}

class C extends B {
	public void x() {
		// TODO Auto-generated method stub
		
	}
}

public class MS8{
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		list.add(new B());
		list.add(new C());
		for(A a: list) {
			a.x();
			a.y();
		}
	}

}
