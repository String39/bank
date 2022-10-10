package modulo7.enumeraciones;

public enum Palos {
	OROS,BASTOS,COPAS,ESPADAS,COMODIN
}

enum ModelosCoche{
	BASICO("Solo tiene motor y ruedas"),
	MEDIO("tiene aireAcondicionado"),
	SUPERIOR("con navegador");
	
	//ATRIBUTOS
	private String descripcion;
	
	//CONSTRUCTORES
	private ModelosCoche(String s) {
		this.descripcion = s;
	}
	
	//METODOS
	public String getDescripcion() {
		return descripcion;
	}
}
