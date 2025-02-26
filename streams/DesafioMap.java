package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 200, 3, 4, 5, 6, 7, 8, 9);
		
		//Incompleto
		nums.stream()
		.map(DesafioMap::converterParaBinario)
		.map(DesafioMap::converterParaInteiro)
		.forEach(DesafioMap::imprimir);
		//Converter para binario
		
	}
	
	public final static void imprimir(Object valor) {
		System.out.print(valor + " ");
	}
	
	public final static String converterParaBinario(int inteiro) {
		return Integer.toBinaryString(inteiro);
	}
	
	public final static int converterParaInteiro(String numString) {
		return Integer.parseInt(numString, 2);
	}

}
