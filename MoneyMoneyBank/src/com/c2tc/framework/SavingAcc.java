package com.c2tc.framework;

public class SavingAcc extends BankAcc {
	public SavingAcc(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		//TODO Auto-generated constructor stub
	}
	
	private static boolean issalary=true;

	public boolean isIssalary() {
		return issalary;
	}

	public void setIssaving(boolean issalary) {
		this.issalary = issalary;
	}

	@Override
	public String toString() {
		return "SavingAcc [issalary=" + issalary + ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName()
				+ ", getAccBal()=" + getAccBal() + "]";
	}

	

	

}
