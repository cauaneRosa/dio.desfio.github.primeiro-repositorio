
public class Polimorfismo {

	public static void main(String[] args) {
		// Polimorfismo é quando uma coisa assume multiplas formas
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diaria de um elefante é de: " + mamifero1.cotaDiariaLeite());
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diaria de um rato é de: " + mamifero2.cotaDiariaLeite());
	}

}
