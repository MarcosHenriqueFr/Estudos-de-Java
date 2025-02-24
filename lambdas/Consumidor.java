package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		//Recebe algo e não retorna nada
		
		Consumer<Produto> imprimir = p -> System.out.printf("O produto %s custa %.2f com %d%% de desconto!\n",
											p.nome, (p.preco * (1 - p.desconto)), (int) (p.desconto * 100));
		
		Produto p1 = new Produto("Notebook", 3560.90, 0.25);
//		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caderno", 32.90, 0.20);
		Produto p3 = new Produto("Lápis", 2.30, 0.05);
		Produto p4 = new Produto("Borracha", 5.00, 0.1);
		Produto p5 = new Produto("Celular", 2289.90, 0.15);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		//O forEach sempre recebe um consumer
		//Para cada produto, use o objeto imprimir da interface Consumer 
		produtos.forEach(imprimir);
		produtos.forEach(System.out::println);
		
		//Teste
//		List<Integer> lista = new ArrayList<Integer>();
//		lista.add(2);
//		lista.add(5);
//		lista.add(11);
//		
//		List<Integer> listaMenorQueDez = new ArrayList<Integer>();
//		
//		lista.forEach(x -> {
//			if(x < 10) {
//				listaMenorQueDez.add(x);
//			}
//		});
//		
//		System.out.println(listaMenorQueDez.toString());
	}
}
