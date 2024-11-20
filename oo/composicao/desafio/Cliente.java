package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	//Uma lista de compras e nome
	//Como calcular os valores gastos -> Obter valor total, de todos os itens e compras
	
	String nome;
	ArrayList<Compra> listaCompras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: listaCompras) {
			total += compra.obterValorCompra();
		}
		
		return total;
	}
	
	String Apresentar() {
		return "Meu nome é "+nome;
	}
	
	String FalarCompras(int compra, int item) {
		return String.format(
				"Eu, %s, comprei %d %s por R$%.2f cada\n", this.nome,
				this.listaCompras.get(compra).listaItens.get(item).quantidade,
				this.listaCompras.get(compra).listaItens.get(item).produto.nome,
				this.listaCompras.get(compra).listaItens.get(item).produto.preco);
	}
}
