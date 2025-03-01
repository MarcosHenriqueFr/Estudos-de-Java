package excecao.personalizadaB;

import streams.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		//Preciso validar porque são exceções checadas
		try {
			Aluno a1 = new Aluno("Ana", 7);
			Validar.usuario(a1);
			Validar.usuario(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
