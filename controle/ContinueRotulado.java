package controle;

public class ContinueRotulado {//Não aconselhado

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) {//matriz e rótulo
			
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					continue externo;//pula somente uma vez, se não tivesse o rotulo iria pular 3 vezes,
					//mesmo exibindo o mesmo resultado
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println();
		}
		
		System.out.println("Fim!");
	}

}
