package com.c2tc.application;
import com.c2tc.application.MMSavingAcc;
import com.c2tc.application.MMBankFactory;
import com.c2tc.framework.SavingAcc;
import com.c2tc.framework.CurrentAcc;
import com.c2tc.framework.BankFactory;



	
public class Customer {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123,"Akshada",10000);
		sa.withdraw(5000);
		CurrentAcc ca=new MMCurrentAcc(1234,"Sanjana",1000);
		ca.withdraw(500);

	}

}
