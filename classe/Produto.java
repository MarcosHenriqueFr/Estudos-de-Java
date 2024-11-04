package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoIncial){//Só fica ativo na construção, parametros para instanciar
		nome = nomeInicial;
		preco = precoIncial;
	}
	
	Produto(){//Construtor padrão
		
	}
	
	double precoComDescontoGerente(double descontoGerente){//não precisa receber esses dados, já esta no objetoo
		return preco * (1 - (desconto + descontoGerente));
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
