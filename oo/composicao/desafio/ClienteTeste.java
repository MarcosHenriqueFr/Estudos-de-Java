package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		//Um cliente, duas compras, alguns itens e produtos, pode ser unidirecional

		Cliente c1 = new Cliente("Jorge Emanuel");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicionarItem(new Produto("Caderno", 20), 4);
		compra1.adicionarItem(new Produto("Impressora", 200), 2);
		compra1.adicionarItem(new Produto("Marcador", 2.50), 10);
		
		compra2.adicionarItem(new Produto("Sofá", 2000), 2);
		compra2.adicionarItem(new Produto("Laptop", 3000), 1);
		compra2.adicionarItem(new Produto("Mesa", 700), 3);
		
		c1.listaCompras.add(compra1);
		c1.listaCompras.add(compra2);
		
		System.out.println(c1.Apresentar());
		System.out.println("O valor da compra 1 foi R$"+compra1.obterValorCompra());
		System.out.println("O valor da compra 2 foi R$"+compra2.obterValorCompra());
		
		double total = c1.obterValorTotal();
		
		System.out.println("O valor total das compras foi: R$"+total);
	}

}
