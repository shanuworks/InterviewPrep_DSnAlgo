package com.google.practisesets;

public class MS1 {

	public static void main(String[] args) throws InterruptedException {
		String str=new String("Morgan Stanley");
		str = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("end of main");
	}
	
	@Override
	protected void finalize() {
		System.out.println("finalize called");
	}

}
