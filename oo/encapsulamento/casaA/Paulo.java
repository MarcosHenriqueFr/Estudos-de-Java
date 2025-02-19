package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	void testeAcessos() {
		// segredo
		// facoDentrodeCasa
		// formaDeFalar
		// todosSabem
		
//		System.out.println(esposa.segredo); PRIVADO, NÃO POSSO VER
		System.out.println(esposa.facoDentrodeCasa); //Posso ver pois estou no mesmo pacote
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
