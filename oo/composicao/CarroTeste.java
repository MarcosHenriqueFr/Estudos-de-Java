package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou encapsulamento
		//c1.motor.fatorInjecao = 20;
		//c1.motor.carro.motor.carro.motor.fatorInjecao = 2;
		System.out.println(c1.motor.giros());
	}

}
