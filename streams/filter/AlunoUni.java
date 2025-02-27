package streams.filter;

public class AlunoUni {

	private final String nome;
	private int idade;
	private double salario;
	
	AlunoUni(String nome, int idade, double salario){
		this.nome = nome;
		setIdade(idade);
		setSalario(salario);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >= 15) {			
			this.idade = idade;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario >= 0) {			
			this.salario = salario;
		}
	}

	public String getNome() {
		return nome;
	}
	
	
}
