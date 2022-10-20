package com.curso.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.Customer;
import com.curso.servicios.ClientesService;

public class ListaClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ListaClientesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientesService cs = new ClientesService();
		List<Customer> lista = cs.todosLosClientes();
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("lista-customers.jsp"); 
		rd.forward(request, response);
	}

}
