package oo.abstrato;

//A implementação só é obrigatória em classes CONCRETAS
public class Cachorro extends Mamifero{

	@Override
	public String mover() {
		return "Move em quatro patas";
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
