package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

//Organização do código por meio dos pacotes
public class Julia {

	Ana sogra = new Ana();
	void MostrarAcessos() {
		
		
//		System.out.println(sogra.segredo);
//		System.out.println(sogra.facoDentrodeCasa);
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);//Só sabe o que é público pois é o único meio de contato entre as classes
	}
}
