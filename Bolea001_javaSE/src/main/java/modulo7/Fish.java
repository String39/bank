package modulo7;

public class Fish extends Animal implements Pet{
	private String name;
	
	public Fish() {
		super(0);
		this.name = "TOTO";
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
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(name + " Juega solo");
	}
	
	public void walk() {
		System.out.println(name + " No anda, solo puede nadar");
	}
	
	@Override
	public void eat() {
		System.out.println(name + " Come comida de peces");
	}
}
