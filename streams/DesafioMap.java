package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverterString = valorString -> new StringBuilder(valorString).reverse().toString();
		
		//Entende que se passa uma string binária, coloco dois valores
		Function<String, Integer> converterParaInteiro = valorString -> Integer.parseInt(valorString, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverterString)
			.map(converterParaInteiro)
			.forEach(DesafioMap::imprimir);
		
	}
	
	public final static void imprimir(Object valor) {
		System.out.print(valor + " ");
	}
	
//	public final static String converterParaBinario(int inteiro) {
//		return Integer.toBinaryString(inteiro);
//	}
//	
//	public final static int converterParaInteiro(String numString) {
//		return Integer.parseInt(numString, 2);
//	}

}
