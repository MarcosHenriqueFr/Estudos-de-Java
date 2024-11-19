package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	//Uma relação com vários itens, uma lista deles
	ArrayList<Item> itens = new ArrayList<>();
	
	//toda compra pode ter um item adicionado
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));//esse método chama o outro
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;//declara que o objeto compra do item é esta compra
	}
	
	double valorTotal() {
		double soma = 0;
		for(Item objeto: itens) {
			soma += objeto.quantidade * objeto.preco;
		}
		
		return soma;
	}
}
