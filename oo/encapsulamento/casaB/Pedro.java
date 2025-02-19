package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;//Importando a classe explicitamente

public class Pedro extends Ana{

//	Ana mae = new Ana(); O código é herdado via herança e não via composição
// Já são herdados automaticamente
	void MostrarAcessos() {
		
//		System.out.println(mae.segredo); - Só ana sabe
//		System.out.println(mae.facoDentrodeCasa) - Não está no mesmo pacote
		
		System.out.println(formaDeFalar);//Herdado, consigo acessar sem instanciar
		System.out.println(todosSabem);//Publico, qualquer um tem acesso
		System.out.println(new Ana().todosSabem);
	}
}
