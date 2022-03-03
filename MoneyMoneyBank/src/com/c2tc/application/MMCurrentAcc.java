package com.c2tc.application;

import com.c2tc.framework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("your required accBal after withdraw"+accBal+" along with credit limit "+creditLimit);
	}

	
	
	

}
