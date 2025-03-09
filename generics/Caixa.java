package generics;

//Generics definido na instancia ou na criação de heranças
//Uma classe genérica, atrasar a resolução do tipo
//Geralmente só uma letra
public class Caixa<T> {

	private T coisa;
	
	//Set e get
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
