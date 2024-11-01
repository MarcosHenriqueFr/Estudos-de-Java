package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		//New determina o construtor
		Produto p1 = new Produto();//2 instâncias
		var p2 = new Produto();
		
		//Cada objeto tem seus valores específicos
		p1.nome = "Notebook";
		p1.preco = 1590.90;
		p1.desconto = 0.15;
		
		p2.nome = "Caneta";
		p2.preco = 2.00;
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precofinal1 = p1.preco * (1 - p1.desconto);
		double precofinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precofinal1 + precofinal2)/2;
		
		System.out.println(precofinal1);
		System.out.println(precofinal2);
		
		System.out.println(mediaCarrinho);
	}

}
