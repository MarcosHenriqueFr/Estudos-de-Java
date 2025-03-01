package excecao.personalizadaA;

import streams.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		try {
			Aluno a1 = new Aluno("Ana", 7);
			Validar.usuario(a1);
			Validar.usuario(null);
			/*Posso fazer uma sequencia de catches
			 *Posso usar tambem catch(excp | excp | excp e) 
			 *Ou seja, pegar tres exceções diferente que recebam o mesmo tratamento
			 * */ 
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
