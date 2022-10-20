package com.curso.servicios;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.Customer;
import com.curso.persistencia.ClienteInMemoryDAO;
import com.curso.persistencia.GenericDAO;


public class ClientesService  {
	GenericDAO<Customer> dao = new ClienteInMemoryDAO();
   
	public void altaCliente (Customer c) {
		dao.add(c);
	}

	public List<Customer> todosLosClientes(){
		return dao.getAll();
		
	}
}
