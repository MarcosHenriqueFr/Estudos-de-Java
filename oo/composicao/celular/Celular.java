package oo.composicao.celular;

public class Celular {

	String nome, marca;
	Chip[] chips = new Chip[2];
	
	Celular(String nome, String marca, Chip chip1, Chip chip2) {
		this.nome = nome;
		this.marca = marca;
		this.chips[0] = chip1;
		this.chips[1] = chip2;
		
		//Chip1 e Chip2 compartilham o mesmo endereço que o da array
		chips[0].celular = this;
		chips[1].celular = this;
	}
}
