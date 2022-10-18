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


public class AltaProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductosService ps= new ProductosService();
       
    
    public AltaProductoServlet() {
        super();
        System.out.println(".......instanciando AltaProductoServlet");
    }

	
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		System.out.println("........estoy en el doPost");
		
		//leer los parametros que recibo en la peticion HTTP
		String paramDescripcion = request.getParameter("descripcion");
		String paramPrecio = request.getParameter("precioUnidad");
		
		//validar parametros
		String msgError = "";
		if(paramDescripcion == null || paramDescripcion.trim().length() == 0) {
			msgError = "Debes indicar una descripcion para el producto";
		}
		
		double precio = 0;
		
		//trim quita espacios tato por delante como por detras
		if(paramPrecio == null || paramPrecio.trim().length() == 0) {
			msgError = "Debes indicar un precio para el producto";
		}else {
			//convierto String precio en double
			precio = Double.parseDouble(paramPrecio); //falta controlar excepcion
		}
		
		if(msgError.length()>0) 
		{
			System.out.println("FALLO " + msgError);
			//despache la pagina altaproducto.jsp
			//response.getWriter().append("error " + msgError);
			
			request.setAttribute("error", msgError);
			RequestDispatcher rd = request.getRequestDispatcher("AltaProducto.jsp");
			rd.forward(request, response);
		}
		else 
		{
			Producto p = new Producto(null, paramDescripcion, precio);
			System.out.println("vamos a dar de alta" + p);
			ps.darAltaProducto(p);
			//despache la pagina listaproductos.jsp
			//response.getWriter().append("OK Todo correcto " + p);
			
			List<Producto> listaProductos = ps.dameTodosLosProductos();
			request.setAttribute("lista", listaProductos);
			RequestDispatcher rd = request.getRequestDispatcher("ListaProductos.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
