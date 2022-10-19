package com.curso.mercado.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.rt.fmt.RequestEncodingTag;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.ProductosService;
import com.curso.mercado.servicios.VentasService;
import com.curso.mercado.servicios.excepciones.VentasException;


public class VentasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VentasServlet() {
        super();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//leer parametro que recibe el idProducto
		String paramId = request.getParameter("idProducto");
		String paramCantidad = request.getParameter("cantidad");
		int idProductoComprar = -1;
		if(paramId != null) {
			idProductoComprar = Integer.parseInt(paramId); //falta controlar la excepcion
		}
		
		int cantidad=1;
		if(paramCantidad !=null) {
			idProductoComprar = Integer.parseInt(paramCantidad);
		}
		
		VentasService servicio = new VentasService();
		String msg = "";
		try {
			servicio.comprarProducto(idProductoComprar, 1);
			//compra ok
			msg = "Has comprado una unidad";
		}catch (VentasException e) {
			//crear un atrib mensaje que indique que ha pasado
			msg = "NO se ha comprado " + e.getMessage();
		}
		request.setAttribute("mensaje", msg);
	
//		ProductosService service = new ProductosService();
//		List<Producto> lista = service.dameTodosLosProductos();
//		request.setAttribute("lista", lista);
//		
		
		//despacho la peticion a ListaProductosServlet que esta se encarga de obtener
		//lista y despechar a la pg jsp lista-productos.jsp
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/ListaProductos");
		rd.forward(request, response);
		//volver a lista
	}

}
