package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	//Ou transformo em uma interface ou um construtor privado
	private Utilitarios() {
		
	}
	//Usando um conjunto de dados
	//lambdas, melhor definir elas em outros arquivos
		public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	//método
		public final static String grito(String n) { 
			return n + "!!! ";
		}
}
