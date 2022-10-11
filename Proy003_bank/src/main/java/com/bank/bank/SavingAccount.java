package com.bank.bank;

public class SavingAccount extends Account {

	private double interestRate;
	
	public SavingAccount(double balanceinicial, double interestRate) {
		super(balanceinicial);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	

}
