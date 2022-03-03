package com.c2tc.framework;

public class BankAcc {
	private int accNo; 
	private String accName; 
    private float accBal;
    
	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	} 
	public  void withdraw(float accBal)
	{
		System.out.println("The accBal of the Bank is"+accBal);
	}
	public void deposit(float accBal)
	{
		System.out.println("The Bank's accBal are"+accBal);
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
    
    

}
