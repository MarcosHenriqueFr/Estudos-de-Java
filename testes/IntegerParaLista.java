package testes;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class IntegerParaLista {

	
	public static void main(String[] args) {
		//Receber um numero e retorna uma lista ordenada
		
		UnaryOperator<List<Integer>> criarListaOrdenada =  lista -> 
			lista.stream().sorted().collect(Collectors.toList());
		
		Function<Integer, List<Integer>> ordenar = num -> {
			List<Integer> lista = new ArrayList<>();
			adicionarNumeros(num, lista);
			return criarListaOrdenada.apply(lista);
		};
		
		System.out.println(ordenar.apply(967543));
	}
	
	public static void adicionarNumeros(Integer num, List<Integer> lista) {
		int tamanho = num.toString().length();
		
		for(int i = 0; i < tamanho; i++) {
			Integer valorAtual = Character.getNumericValue(num.toString().charAt(i));
			lista.add(valorAtual);
		}
	}
	
}
