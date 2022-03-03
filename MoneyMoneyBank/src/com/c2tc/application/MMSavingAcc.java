package com.c2tc.application;

import com.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("your accBal after withdraw"+accBal);
		}

	@Override
	public String toString() {
		return "MMSavingAcc [isIssalary()=" + isIssalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + "]";
	}	
	

}
