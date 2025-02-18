package oo.heranca;

//extends recebe atributos e comportamentos por herança
//Existe entrelaçamentos entre os pilares
public class Monstro extends Jogador{
	String nome = "Monstro";
	
	//Pelo menos uma tem que chamar um SUPER
	Monstro(){
		this(0, 0);
	}
	
	Monstro(int x, int y){
		super(x, y);
	}
}
