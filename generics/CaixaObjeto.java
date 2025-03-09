package generics;

public class CaixaObjeto {

	private Object coisa;
	
	//Set e get
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
