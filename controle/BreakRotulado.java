package controle;

public class BreakRotulado {//Não aconselhado

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) {//matriz e rótulo
			
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					break externo;//quebra o for externo a esse
					//o break naturalmente age dentro da estrutura em que foi inserido
					//Confunde o entendimento do fluxo do código
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println();
		}
		
		System.out.println("Fim!");
	}

}
