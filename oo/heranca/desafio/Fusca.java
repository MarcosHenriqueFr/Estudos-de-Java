package oo.heranca.desafio;

public class Fusca extends Carro{
	//Só consegui dar override do nome quando chamei o método
	//Então é só modificar quando for herdado no Construtor
	
	Fusca(){
		//Ou defino diretamente chamando o super com valor padrão, ou faço outro construtor
		super(120);
		this.nome = "Fusca";
	}
}
