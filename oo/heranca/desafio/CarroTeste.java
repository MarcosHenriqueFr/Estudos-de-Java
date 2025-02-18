package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		Carro fusca = new Fusca();
		Carro ferrari = new Ferrari();
		Carro teste = new Carro(60);
		
		System.out.println(fusca.MostrarVelocidade());
		System.out.println(ferrari.MostrarVelocidade());
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.acelerar();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		//NÃO CONTABILIZA DEVIDO AO BOOLEAN
		fusca.frear();
		fusca.frear();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(teste.MostrarVelocidade());
		System.out.println(fusca.MostrarVelocidade());
		System.out.println(ferrari.MostrarVelocidade());
	}
}
