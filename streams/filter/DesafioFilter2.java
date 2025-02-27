package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	//Promoção maior que 30% e frete gratis, map para mostrar
	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
		
		Produto p1 = new Produto("Notebook", 3280.89, 0.5, true);
		Produto p2 = new Produto("Lápis", 12.89, 0.3, true);
		Produto p3 = new Produto("Celular", 2156.50, 0.45, false);
		Produto p4 = new Produto("Máquina de lavar", 6280.89, 0.2, false);
		Produto p5 = new Produto("TV SMART", 5310.90, 0.32, true);
		Produto p6 = new Produto("Jogo", 300.29, 0.05, false);
//		Produto p7 = criarProduto(entrada);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> isMegaPromocao = p -> p.getDesconto() >= 0.3;
		Predicate<Produto> isFreteGratis = p -> p.isFreteGratis();
		Predicate<Produto> isRelevante = p -> p.getPreco() >= 500;
		Function<Produto, String> apresentarProduto = 
				p -> String.format("%s está em MEGA PROMOÇÃO por apenas R$%.2f", 
								p.getNome(), p.precoComDesconto());
				
		//Isso é um pipeline de execução
		produtos.stream()
				.filter(isMegaPromocao)
				.filter(isFreteGratis)
				.filter(isRelevante)
				.map(apresentarProduto)
				.forEach(System.out::println); //Da para usar um JSON fora usando o console
		
//		entrada.close();
	}
	
	public static Produto criarProduto(Scanner entrada) {
		String nome;
		double preco, desconto;
		boolean freteGratis;
		
		System.out.println("Crie um produto: ");
		System.out.println("Digite um nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite um preco: ");
		preco = Double.valueOf(entrada.nextLine());
		
		System.out.println("Digite um desconto: ");
		desconto = Double.valueOf(entrada.nextLine());
		
		System.out.println("O frete será gratuito? Y / N");
		freteGratis = entrada.nextLine().equalsIgnoreCase("y") ? true : false;
		
		return new Produto(nome, preco, desconto, freteGratis);
	}
}
