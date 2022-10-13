package modulo7;

public class Cat extends Animal implements Pet{
	private String name;

	public Cat() {
		//super(4);
		this("");
	}

	public Cat(String name) {
//		this();
//		this.name = name;
		super(4);
		this.name = name;
	}


	@Override
	public String getNombre() {
		return name;
	}

	@Override
	public void setNombre(String n) {
//		if(name.equals(name)) {
//			System.out.println("Puedes cambiar el nombre");
//		}
//		else {
//			System.out.println("No puedes cambiar el nomnbre");
//		}
		this.name = n;
	}

	@Override
	public void play() {
		System.out.println(name + " Juega con lana");		
	}
	
	@Override
	 public void eat() {
		System.out.println(name + " Come pescado Azul");
	}
	
}
