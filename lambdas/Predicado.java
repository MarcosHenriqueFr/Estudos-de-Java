package lambdas;

import java.util.function.Predicate;

//Entra um parametro e sai um boolean, geralmente usa o formato "is+Pergunta"
//Funciona como o filter do JS
public class Predicado {

	public static void main(String[] args) {
		//Recebe um parametro do tipo produto
		//retorna true se atender a condição
		
		//Tipo/Interface<Classe/Parametro> OBJ = OBJPRODUTO -> return Atributo >= condicao
		Predicate<Produto> isCaro = objProduto -> objProduto.preco * (1-objProduto.desconto) >= 750;
		
		Produto produto1 = new Produto("Geladeira", 5690.99, 0.1);
		System.out.println(isCaro.test(produto1));
	}
}
