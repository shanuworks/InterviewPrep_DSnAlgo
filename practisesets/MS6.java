package com.google.practisesets;

abstract public class MS6 {
	protected abstract double getSalesAmt();
	public double getComm() {
		return getSalesAmt()*0.15;
	}
}

class Sales extends MS6 {

	public double getSalesAmt() { // public or protected not default or private
		return 1230.45;
	}
	
}
