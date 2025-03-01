package excecao;

import streams.Aluno;

public class Causa {

	public static void main(String[] args) {
		//Uma exceção pode causar outra, pode ter várias exceções uma dentro da outra
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}

	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	//Causa Original
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nulo");
		}
		
		System.out.println(aluno.getNome());
	}
}
