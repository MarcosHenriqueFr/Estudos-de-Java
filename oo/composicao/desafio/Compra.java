package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	//somente uma lista de itens
	//metodo de cada valor de compra
	
	ArrayList<Item> listaItens = new ArrayList<Item>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.adicionarItem(new Item(produto, quantidade));
	}
	
	void adicionarItem(Item item) {
		this.listaItens.add(item);
	}
	
	//pega os valores de cada compra realizada pelo cliente
	double obterValorCompra() {
		double soma = 0;
		
		for(Item objeto: listaItens) {
			soma += (objeto.produto.preco * objeto.quantidade);
		}
		
		return soma;
	}
}
