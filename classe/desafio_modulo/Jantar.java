package classe.desafio_modulo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jorge", 76.3);
		Comida c1 = new Comida("Feijoada", 2);
		Comida c2 = new Comida("Arroz", 0.5);

		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
	}

}
