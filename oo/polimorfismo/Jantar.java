package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(89.7);
		Comida ing1 = new Arroz(0.250);
		Feijao ing2 = new Feijao(0.150);
		Comida ing3 = new Sorvete(0.300);
//		Comida c1 = new Comida(0); Seria possível porque está no mesmo pacote, mas é abstrata

		System.out.println(convidado);
		
		convidado.comer(ing1);
		convidado.comer(ing2);
		convidado.comer(ing3);
		
		System.out.println(convidado);
	}

}
