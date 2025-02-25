package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		//Valores de entrada/retorno
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "par" : "ímpar";
		
		System.out.println(parOuImpar.apply(257));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: "+valor;
		Function<String, String> limparEspacos = valor -> valor.trim();
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		//O mesmo princípio de encadeamento, composição de funções(melhor usar Funções pequenas que podem ser reusadas)
		
//		String resultadoFinal = oResultadoE.apply(parOuImpar.apply(21));
		//Demonstra a saida da function par para function res e depois mostra a entrada da primeira
		//Funciona desde que a saida seja igual a entrada da outra função
		String resultadoFinal = parOuImpar.andThen(limparEspacos)
										  .andThen(oResultadoE)
										  .andThen(empolgado)
										  .apply(21);//Valor inicial de entrada
		System.out.println(resultadoFinal);
	}
}
