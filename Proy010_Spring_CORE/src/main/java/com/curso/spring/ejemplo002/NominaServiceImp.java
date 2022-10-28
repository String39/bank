package com.curso.spring.ejemplo002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="nominas")
public class NominaServiceImp implements NominasService{

	//inyecta en la variable de ref irpfService una instancia de 
	//IRPFServiceimp
	@Autowired
	private IRPFService irpfService;
	
	public NominaServiceImp() {
		System.out.println("****** NominaServiceImp *****");	}
	
	@Override
	public void calcularNomina() {
		System.out.printf("................. tu nomina es %f con un "
				+ " IRPF %5.3f %n",233.0, irpfService.calcularIRPF());
		
	}

}
