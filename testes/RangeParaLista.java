package testes;

import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

public class RangeParaLista {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, List<Integer>> criarLista = (inicio, fim) -> {
			List<Integer> listaPares = new ArrayList<>();
			
			for(int i = inicio; i <= fim; i++) {
				if(i % 2 != 0) continue;
				listaPares.add(i);
			}
			
			return listaPares;
		};
		
		System.out.println(criarLista.apply(5, 20));

	}

}
