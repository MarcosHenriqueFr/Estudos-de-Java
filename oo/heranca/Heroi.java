package oo.heranca;

//Recebe todos os atributos do Jogador, especificando
public class Heroi extends Jogador{
	public String nome = "Herói";
	
	public Heroi(int x, int y){
		super(x, y);
	}

	//Se uso a mesma identidade do método ele sobrescreve
	public boolean atacar(Jogador oponente) {
		//chamou o método da superclasse, chamei duas vezes
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		return ataque1 || ataque2 || ataque3;
	}
}
