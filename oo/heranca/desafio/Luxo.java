package oo.heranca.desafio;

//Os métodos aqui são públicos e abstratos
public interface Luxo {

	//Abstrato - Não tem corpo
	public abstract void ligarAr();
	void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	};
}
