package oo.encapsulamento;

public class Pessoa {

	//Usando o getters and setters
	//Get(mesmo tipo do atributo) - leitura(geralmente void), Set - Altera
	private String nome;
	private String sobrenome;
	private int idade;
	

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//Getter
	public int getIdade() {
		return idade;
	}
	
	//Aplicar o mesmo método em diversas partes do código, o usuário não precisa saber oq acontece
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {			
			this.idade = novaIdade;
		}
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNomeCompleto() + " e tenho " + getIdade() + " anos!";
	}
}
