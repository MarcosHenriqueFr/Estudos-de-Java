package lambdas;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();//Todo construtor chama um super, pois toda classe herda a CLASSE MÃE OBJETO
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return String.format("%s tem R$%.2f", nome, precoFinal);
	}
}
