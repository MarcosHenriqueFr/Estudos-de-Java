package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {

	public static void main(String[] args) {
		Carro fusca = new Fusca();
		//Tem que ser especifico para usar a interface
		Ferrari ferrari = new Ferrari();
		Carro teste = new Carro(60);
		
		System.out.println(fusca.MostrarVelocidade());
		System.out.println(ferrari.MostrarVelocidade());
		
		teste.acelerar();
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
		
		ferrari.ligarTurbo();
		
		ferrari.acelerar();
		ferrari.acelerar();
		
		ferrari.ligarAr();
		
		ferrari.acelerar();
		
		ferrari.desligarAr();
		ferrari.desligarTurbo();
		
		System.out.println(teste.MostrarVelocidade());
		System.out.println(fusca.MostrarVelocidade());
		System.out.println(ferrari.MostrarVelocidade());
	}
}
