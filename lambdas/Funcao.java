package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		//Valores de entrada/retorno
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "par" : "ímpar";
		
		System.out.println(parOuImpar.apply(257));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: "+valor;
		
		//O mesmo princípio de encadeamento, composição de funções(Funções pequenas que podem ser reusadas)
		System.out.println(oResultadoE.apply(parOuImpar.apply(21)));
	}
}
