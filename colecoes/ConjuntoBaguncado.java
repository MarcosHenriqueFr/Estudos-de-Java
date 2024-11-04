package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {//Não faça assim, use dados homogêneos

	//Silenciar advertências 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//Já mostram no console como strings
		//Conversões para seus Wrappers
		conjunto.add(1.2);// double -> Double
		conjunto.add(true);
		conjunto.add("Olá mundo");
		conjunto.add(1);
		conjunto.add('x');
		conjunto.add('x');

		System.out.println(conjunto.size());
		System.out.println(conjunto.remove("Olá mundo"));//Retorna um boolean e remove
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.size());
		System.out.println(conjunto);
		
		//Princípios da orientação a objetos
		Set nums = new HashSet();
		nums.add(2);
		nums.add(9);
		nums.add(1);
		
		System.out.println(nums);
		
		//conjunto.addAll(nums);//Uma união dos conjuntos
		conjunto.retainAll(nums);//Uma interseção
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
