package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Determine o tipo a partir do sinal <>, posso fazer uma lista de classes feitas
		//Faz erros de compilação se não seguir
		//<> -> Generics
	
		//Confirmação automática
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Maria");
		listaAprovados.add("Carlos");
		listaAprovados.add("Marildo");
		listaAprovados.add("Ana");
		listaAprovados.add("Geraldo");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(2);
		nums.add(3);
		nums.add(40);
		nums.add(23);
		
		for(int num: nums) {
			System.out.println(num);
		}
	}

}
