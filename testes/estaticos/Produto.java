package testes.estaticos;

public class Produto {

	//Se mudar o valor, ele muda na instancia e no objeto
	static int id = 42;
	protected String nome;
	
	public String getNome() {
		return this.nome;
	}
}
