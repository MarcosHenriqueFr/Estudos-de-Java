package oo.composicao;

public class Carro {
	final Motor motor;//Instancia o objeto diretamente na classe carro
	
	Carro(){
		this.motor = new Motor(this);//Relação bidirecional via composição
	}
		
	void acelerar() {
		if(motor.fatorInjecao < 3.0) {			
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
