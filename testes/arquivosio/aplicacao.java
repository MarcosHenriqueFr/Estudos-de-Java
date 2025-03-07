package testes.arquivosio;

public class aplicacao {

	public static void main(String[] args) {
		String[] nomes = {"João", "Mauro", "José", "Sofia"};
		ArquivoF arquivo = new ArquivoF();
		
		arquivo.escreverArquivo(nomes);
		arquivo.lerArquivo();
	}
}
