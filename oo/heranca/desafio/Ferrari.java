package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	//Dentro do método eu posso modificar a classe SUPER, mas fora não
	//Se eu colocar o mesmo nome em um atributo filho, ele só irá esconder e não sobrescrever
	Ferrari(){
		this(230);
		this.nome = "Ferrari";
	}
	
	Ferrari(int velocidadeFinal){
		super(velocidadeFinal);
		delta = 15;
	}

	int contFinalAcelerar = 0;
	int contFinalFrear = 0;

	@Override
	boolean acelerar() {
		boolean acelerou1 = super.acelerar();
		boolean acelerou2 = super.acelerar();
		boolean acelerou3 = super.acelerar();
		
		contFinalAcelerar++;
		
		return acelerou1 || acelerou2 || acelerou3;
	}
	
	//Essa estrutura é um ANNOTATION, ajuda a leitura
	@Override
	boolean frear() {
		boolean freou1 = super.frear();
		boolean freou2 = super.frear();
		
		contFinalFrear++;
		
		return freou1 || freou2;
	}
	
	String MostrarVelocidade() {
		return String.format("A velocidade do %s é %dKM/H! E acelerou %d vezes"
				+ " e freou %d vezes\n", nome, velocidadeAtual, contFinalAcelerar, contFinalFrear);
	}
}
