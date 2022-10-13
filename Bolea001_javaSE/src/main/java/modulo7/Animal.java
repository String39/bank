package modulo7;

public abstract class Animal {
	protected int legs;

	public Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Este animal anda con: " + legs + "patas");
	}
	
	public abstract void eat();
		
	
}
