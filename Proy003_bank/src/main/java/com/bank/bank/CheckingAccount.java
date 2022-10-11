package com.bank.bank;

public class CheckingAccount extends Account{
	
	private double overdraf;

	public CheckingAccount(double balanceinicial, double overdraf) {
		super(balanceinicial);
		this.overdraf = overdraf;
	}
	
	public CheckingAccount(double balanceinicial) {
		this(balanceinicial,0.0);
	}

	public double getOverdraf() {
		return overdraf;
	}

	public void setOverdraf(double overdraf) {
		this.overdraf = overdraf;
	}
	
	
	public boolean withdraw(double amt) {
		boolean r = true;
		if(balance < amt) {
			double f = balance - amt;
			if(overdraf < f) {
				r = false;
			}
			else 
			{
				overdraf = overdraf -f;
				r = true;
			}	
		}
		else {
			balance = balance -amt;
		}
		return r;
	}
}
