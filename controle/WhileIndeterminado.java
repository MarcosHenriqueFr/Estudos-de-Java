package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean saiu = false;
		
		while(!saiu) {//indeterminado de vezes
			System.out.println("Escreva \"sair\" para sair do programa!");
			
			String resposta = entrada.next();
			
			if(resposta.equalsIgnoreCase("sair")) {
				System.out.println("Você saiu do programa");
				saiu = true;
			} else {
				System.out.println("Palavra incorreta digitada!");
			}
		}
		
		entrada.close();

	}

}
