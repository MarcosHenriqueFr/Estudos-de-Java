package excecao.personalizadaA;

//Uma exceção personalizada que herda da runtime exception

//Transformar uma classe em uma string e colocar o objeto na memória e poder reutilizar essa memoria novamente
@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}
}
