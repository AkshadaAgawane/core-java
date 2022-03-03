package com.c2tc.application;

import com.c2tc.framework.BankFactory;
import com.c2tc.framework.CurrentAcc;
import com.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal) {
		SavingAcc sa=new SavingAcc(accNo, accName, accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal) {
		CurrentAcc ca=new CurrentAcc(accNo, accName, accBal);
		return ca;
	}

}
