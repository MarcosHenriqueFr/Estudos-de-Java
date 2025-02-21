package oo.abstrato;

public abstract class Mamifero extends Animal{
	
	//Todos tem mas não é possível implementar ainda
	public abstract String mamar();
	
	//O método final não pode ser sobrescrito nas sub classes
//	@Override
//	public final String mover() {
//		return "Saindo do lugar";
//	}
}
