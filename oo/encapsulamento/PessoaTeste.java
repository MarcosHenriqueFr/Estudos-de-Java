package oo.encapsulamento;

public class PessoaTeste {

	//Para evitar modificações diretas é melhor criar métodos públicos que possam resolver o problema
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Amado", "Batista", -47);
		//p1.idade = -20;//alterou livremente pois ficou público
		
		p1.setIdade(150);
		System.out.println(p1.getIdade());
		System.out.println(p1);//chama o toString
		System.out.println(p1.getNomeCompleto());
	}

}
