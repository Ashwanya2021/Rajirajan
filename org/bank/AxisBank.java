package org.bank;

public class AxisBank extends RbiBank {
	public void deposit() {
		System.out.println("Deposit:6%");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
//		a.savings();
		a.deposit();
	}

}
