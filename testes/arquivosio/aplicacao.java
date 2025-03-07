package testes.arquivosio;

public class aplicacao {

	public static void main(String[] args) {
		String[] nomes = {"João", "Mauro", "José", "Sofia"};
		Arquivo a1 = new Arquivo();
		
		a1.escreverArquivo(nomes);
		a1.lerArquivo();
	}
}
