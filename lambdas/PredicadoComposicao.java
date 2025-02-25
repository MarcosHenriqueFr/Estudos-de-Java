package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer> isPar = x -> x % 2 == 0;
		Predicate<Integer> isTresDigitos = x -> x >= 100 && x <= 999;
		
		//Interface function e predicate são uma das poucas que se pode fazer comp de função
		//Uma operação logica de and com duas funções
		System.out.println(isPar.and(isTresDigitos).test(211));
		System.out.println(isPar.and(isTresDigitos).negate().test(211));
		System.out.println(isPar.or(isTresDigitos).test(211));
		
	}
}
