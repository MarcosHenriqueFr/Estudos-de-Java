package excecao.personalizadaB;

import streams.Aluno;

public class Validar {

	private Validar() {
		
	}
	
	
	public static void usuario(Aluno aluno) 
			throws StringVaziaException, NumeroForaIntervaloException {
		
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
