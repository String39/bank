package modulo7;

public class Cliente {
	private static final double DESCUENTO_MAX = 30.0;
	
	private String nombre;
	
	public void verDatos() {
		System.out.println("----- datos del cliente");
	}
	
	public final void hazAlgo() {
		System.out.println("trabajando-----");
	}
}


final class ClienteVIP extends Cliente{
	@Override
	public void verDatos() {
		super.verDatos();
	}
	
//	public void hazAlgo() {
//		//error porque esta declarado como final
//	}
}

//no se puede crear
//class ClienteExtraVIP extends ClienteVIP{ 
//	//error de compilacion
//}
