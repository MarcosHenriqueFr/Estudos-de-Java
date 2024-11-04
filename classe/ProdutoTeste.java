package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		//New determina o construtor
		//Cada objeto tem seus valores específicos
		Produto p1 = new Produto("Notebook", 1590.90);//2 instâncias
		var p2 = new Produto();
		p2.nome = "Caneta";// Posso alterar essas variáveis depois
		p2.preco = 2.00;
		
		Produto.desconto = 0.5;//Alteração em todos os produtos, alteração explícita
		
		double precofinal1 = p1.precoComDescontoGerente(0.3);
		double precofinal2 = p2.precoComDesconto();//Aplicado o 25% de desconto
		double mediaCarrinho = (precofinal1 + precofinal2)/2;
		
		System.out.printf("%s: R$%.2f\n", p1.nome, precofinal1);
		System.out.printf("%s: R$%.2f\n", p2.nome, precofinal2);
		
		//Classe.atributo.método
		System.out.printf("Média do carrinho: R$%.2f\n", mediaCarrinho);
	}

}
