package classe.desafio_modulo;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida c) {
		if(c != null) {
			this.peso += c.pesoComida;
		}
		return peso;			
	}
	
	String apresentar() {
		return "Eu sou "+nome+" tenho "+peso+" Kgs.";
	}
}
