package lambdas;

import java.util.function.UnaryOperator;

public class Unario {

	public static void main(String[] args) {
		//Funções bem específicas são melhores para reuso
		UnaryOperator<Integer> maisDois = x -> x + 2;
		UnaryOperator<Integer> vezesDois = x -> x * 2;
		UnaryOperator<Integer> aoQuadrado = x -> x * x;
		
		int resultado1 = maisDois
						.andThen(vezesDois)
						.andThen(aoQuadrado)
						.apply(4);
		
		//O contrário do andThen
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}
