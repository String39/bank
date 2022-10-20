package com.curso.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.curso.Bank;
import com.curso.Customer;

public class ClienteInMemoryDAO implements GenericDAO<Customer> {

	@Override
	public void add(Customer c) {
		Bank.addCustomer(c.getFirstName(), c.getLastName());
	}

	@Override
	public List<Customer> getAll() {
		return null;
	}
	
}
