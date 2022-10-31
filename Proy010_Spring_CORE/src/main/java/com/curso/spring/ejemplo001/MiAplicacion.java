package com.curso.spring.ejemplo001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {
	public static void main(String[] args) {
		
		//SIN SPRING Inyeccion de la Dependencia
		SaludoService servicio = new SaludoServiceImp();
		servicio.saludar("Amigo");
		
		System.out.println("..........................................");
		
		//CON SPRINF IOC
		//ya no voy a crear nunca mas una instancia de la clase
		//sino que voy a solicitar al contenedor de Benas de Spring
		//que me entege una instancia
		
		//contenedor de beans de spring
		//es el que maneja el ciclo de vida de los obj
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mis-beans.xml");
		
		
		//MISMA DIRECCION MEMORIA
//		SaludoService s1 = (SaludoService) ctx.getBean("saludador1");
//		s1.saludar("Soy saludador 1");
//		
//		System.out.println(s1);
//		SaludoService s2 = (SaludoService) ctx.getBean("saludador1");
//		System.out.println(s2);
		
		
		//CREA DISTINTOS CON DIRECC MEMORIA
//		SaludoService s1 = (SaludoService) ctx.getBean("saludadorPrototipo");
//		s1.saludar("Soy saludador 1");
//		
//		System.out.println(s1);
//		SaludoService s2 = (SaludoService) ctx.getBean("saludadorPrototipo");
//		System.out.println(s2);
		
		SaludoService sAdios = (SaludoService) ctx.getBean("saludadorAdios");
		sAdios.saludar(" soy saludador");
		
	}
}
