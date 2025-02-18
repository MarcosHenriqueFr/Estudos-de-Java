package oo.heranca.desafio;

public class Carro {

	//Como um carro padrão aceleraria
	String nome = "Carro Padrão";
	int velocidadeAtual = 20;
	int delta = 5;
	int contAcelerou = 0;
	int contFreou = 0;
	final int VELOCIDADE_MAXIMA;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	boolean acelerar() {
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0;
			return false;
		} else if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return true;
		} else {
			contAcelerou++;
			velocidadeAtual += 5;
			return true;
		}
	}
	
	boolean frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			contFreou++;
			return true;
		} else {
			velocidadeAtual = 0;
			return false;
		}
	}
	
	String MostrarVelocidade() {
		return String.format("A velocidade do %s é %dKM/H! E acelerou %d vezes"
				+ " e freou %d vezes\n", nome, velocidadeAtual, contAcelerou, contFreou);
	}
}
