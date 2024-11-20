package oo.composicao.desafio2;

public class ClienteTeste {

	public static void main(String[] args) {
		//Todos os testes
		Cliente c1 = new Cliente("Manuela");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicionarItem("Caderno", 23, 3);
		compra1.adicionarItem("Geladeira", 2000, 2);
		compra1.adicionarItem("Pia", 500, 1);
		
		compra2.adicionarItem("Fogão", 1600, 1);
		compra2.adicionarItem("Memória Ram", 200, 5);
		compra2.adicionarItem("Laptop", 4500, 2);
		
		c1.compras.add(compra1);
		c1.adicionarCompra(compra2);
		
		System.out.println("O valor da Compra 1 é R$"+compra1.obterValorCompra());
		System.out.println("O valor da Compra 2 é R$"+compra2.obterValorCompra());
		
		System.out.printf("A soma dos valores das compras da cliente %s é R$%.2f\n", c1.nome, c1.obterValorTotal());
	}

}
