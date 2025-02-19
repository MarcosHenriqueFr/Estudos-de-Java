package oo.heranca;

//extends recebe atributos e comportamentos por herança
//Existe entrelaçamentos entre os pilares
public class Monstro extends Jogador{
	public String nome = "Monstro";
	
	//Pelo menos uma tem que chamar um SUPER
	public Monstro(){
		this(0, 0);
	}
	
	public Monstro(int x, int y){
		super(x, y);
	}
}
