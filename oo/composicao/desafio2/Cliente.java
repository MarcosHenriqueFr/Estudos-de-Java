package oo.composicao.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	//Um cliente tem muitas compras
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	//É melhor criar métodos para trabalhar com listas e objetos
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorCompra();
		}
		
		return total;
	}
}