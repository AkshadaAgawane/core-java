package com.c2tc.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accNo,String accName,float accBal);
	public CurrentAcc getNewCurrentAccount(int accNo, String accName,float accBal);
}
