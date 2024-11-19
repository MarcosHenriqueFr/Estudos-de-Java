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
}
