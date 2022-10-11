package com.bank.bank;

public class CustomerReport {
	private Bank b;

	public CustomerReport() {
	}

	public Bank getB() {
		return b;
	}

	public void setB(Bank b) {
		this.b = b;
	}
	
	public void generatereport() {
		// Print report header
        System.out.println("CUSTOMERS REPORT");
        System.out.println("================");
        
        // For each customer...
        for ( int i = 0;i < b.getNumberOfCustomers();i++ ) {
            Customer customer = b.getCustomer(i);
            
            System.out.println();
            System.out.println("Customer: " + customer.getNombre() + ", " + customer.getApellidos());
            
            for ( int j = 0;j < customer.getNumberOfAccounts();j++ ) {
                Account account = customer.getAccount(j);
                String  account_type = "";
                
                // Determine the account type
                if ( account instanceof SavingAccount ) {
                    account_type = "Savings Account";
                } else if ( account instanceof CheckingAccount ) {
                    account_type = "Checking Account";
                } else {
                    account_type = "Unknown Account Type";
                }
                
                // Print the current balance of the account
                System.out.println("    " + account_type + ": current balance is "
                        + account.getBalance());
            }
        }
    }
}
