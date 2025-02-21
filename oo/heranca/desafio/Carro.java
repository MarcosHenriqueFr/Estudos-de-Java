package oo.heranca.desafio;

public class Carro {

	//Como um carro padrão aceleraria
	protected String nome = "Carro Padrão";
	protected int velocidadeAtual = 20;
	private int delta = 5;
	protected int contAcelerou = 0;
	protected int contFreou = 0;
	private final int VELOCIDADE_MAXIMA;//NUNCA MUDA, não importa se é público
	
	//Se tirar o construtor padrão, terá impacto em todas as heranças
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		delta = Math.abs(delta);
		this.delta = delta;
	}

	public boolean acelerar() {
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0;
			return false;
		} else if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return true;
		} else {
			contAcelerou++;
			velocidadeAtual += getDelta();
			return true;
		}
	}
	
	public boolean frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			contFreou++;
			return true;
		} else {
			velocidadeAtual = 0;
			return false;
		}
	}
	
	public String MostrarVelocidade() {
		return String.format("A velocidade do %s é %dKM/H! E acelerou %d vezes"
				+ " e freou %d vezes\n", nome, velocidadeAtual, contAcelerou, contFreou);
	}
}
