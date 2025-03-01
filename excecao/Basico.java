package excecao;

import streams.Aluno;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		try {			
			imprimirAluno(a1);
			//Erro de forma generica
		} catch(Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário!");
		}
		
		try {
			System.out.println(7/0);
			//Erro de forma especifica, melhor para a leitura e documentação de codigo
		} catch (ArithmeticException e) {
			//Silenciar(evitar) -> Ao menos coloque no log, Gerar outro erro, Mostrar Mensagem
			//Posso salvar o erro em um arquivo de log ao inves de mandar ao usuario
			//e.printStackTrace(); //Imprime a pilha de execução, é assincrono
			System.out.println("Ocorreu o erro de: "+ e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	//Posso passar um valor nulo, não sei se ele existe
	public static void imprimirAluno(Aluno a) {
		System.out.println("Nome do aluno: " + a.getNome());
	}
}
