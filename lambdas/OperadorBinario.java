package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media = (x, y) -> (x + y)/2; 
		
		System.out.println(media.apply(7.6, 9.8));
		
		//Poderiam ser duas funções
		BiFunction<Double, Double, String> resultado = (num1, num2) -> {
			double notaMedia = (num1 + num2) / 2;
			return  notaMedia >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(6.6, 7.39));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(4.5, 9.5));

	}

}
