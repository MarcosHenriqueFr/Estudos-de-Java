package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "João Gomes";
		
		//Relações bidirecionais
//		compra1.adicionarItem(new Item("Caneta", 20, 6.42));
//		compra1.adicionarItem(new Item("Borracha", 10, 5.41));
//		compra1.adicionarItem(new Item("Caneta", 8, 20.3));
		
		//Somente passar os parâmetros na relação bidirecional, porém sua construção é um pouco mais complicada
		compra1.adicionarItem("Caneta", 20, 6.42);
		compra1.adicionarItem("Borracha", 10, 5.41);
		compra1.adicionarItem("Caneta", 8, 20.3);

		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.valorTotal());
		
		double total = compra1.itens.get(0).compra.itens.get(1).compra.valorTotal();
		System.out.println("O total é "+total);
	}

}
