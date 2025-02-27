package streams.filter;

public class Produto {

	private final String nome;
	private double preco;
	private double desconto;
	private final boolean freteGratis;
	
	public Produto(String nome, double preco, double desconto, boolean freteGratis) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public boolean isFreteGratis() {
		return freteGratis;
	}
	
	public double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
