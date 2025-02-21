package oo.polimorfismo;

public class Pessoa {

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	
	//Os tipos são diferentes, sobrecarga de métodos
//	public void comer(Arroz arroz) {
//		this.peso += arroz.getPeso();
//	}
//	public void comer(Feijao feijao) {
//		this.peso += feijao.getPeso();
//	}
//	public void comer(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	} 
	
	public String toString() {
		return String.format("Eu peso %.2f kgs agora!", getPeso());
	}
}
