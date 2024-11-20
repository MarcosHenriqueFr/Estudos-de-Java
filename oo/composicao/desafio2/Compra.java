package oo.composicao.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	double obterValorCompra() {
		double soma = 0;
		
		for(Item item: itens) {
			soma += (item.quantidade * item.produto.preco);
		}
		
		return soma;
	}
}
