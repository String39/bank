package com.curso.mercado.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.ProductosService;


public class ListaProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
    public ListaProductosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperar todos los productos
		ProductosService service = new ProductosService();
		List<Producto> lista = service.dameTodosLosProductos();
		
		//añadir el atributo lista con todos los prod a la request
		request.setAttribute("lista", lista);	
		
		//despachar la peticuion a listaProductos.jsp
		RequestDispatcher rd = request.getRequestDispatcher("lista-productos.jsp");
		rd.forward(request, response);
	}

}
