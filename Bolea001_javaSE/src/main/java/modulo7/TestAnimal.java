package modulo7;

public class TestAnimal {

	public static void main(String[] args) 
	{
		Fish f = new Fish();
		Cat c = new Cat("Amelio ");
		Cat c1 = new Cat("Pepito ");
		Spider s = new Spider();
		Animal a = new Spider();
		Animal a1 = new Fish();
		Pet p = new Cat();
		
		f.play();
		c.play();
		c1.play();
		
		a.eat();
		a1.walk();
		a.walk();
	}

}
