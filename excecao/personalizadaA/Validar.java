package excecao.personalizadaA;

import streams.Aluno;

public class Validar {

	private Validar() {
		
	}
	
	//Todas são Runtime, ou seja, não preciso verificae
	public static void usuario(Aluno aluno) {
		//Aconselhável usar as exceções do java
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo :)");
		}
		
		if(aluno.getNome() == null || aluno.getNome().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.getNota() < 0 || aluno.getNota() > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
