package generics;

public class ParesTeste {

	public static void main(String[] args) {
		//Posição e nome => Criterio de igualdade é chave
		//Uma classe com chave e valor
		//Set -> ignora valor igual
		//Map -> Remapeia o valor
		
		//A lista não tem ordenamento
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Milena");
		resultadoConcurso.adicionar(3, "José");
		resultadoConcurso.adicionar(4, "Letícia");
		resultadoConcurso.adicionar(2, "Sofia");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
