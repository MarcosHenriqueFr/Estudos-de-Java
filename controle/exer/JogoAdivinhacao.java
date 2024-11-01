package controle.exer;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tentativas = 10, chute = -1;
		
		double randomOriginal = (Math.random() * 101);
		int randomFormatado = (int) randomOriginal;
		
		while(tentativas > 0) {
			System.out.println("Informe um valor de 0 a 100:");
			chute = entrada.nextInt();
			
			tentativas--;
			
			if(chute > randomFormatado) {
				System.out.println("Chute mais baixo!");
			} else if(chute < randomFormatado) {
				System.out.println("Chute mais alto!");
			} else {
				System.out.println("Você ganhou o jogo");
				break;
			}
			
			System.out.printf("Você tem %d tentativas restantes\n\n", tentativas);
		}
		
		if(tentativas == 0) {
			System.out.println("Perdeu o jogo!");
		}
		
		entrada.close();
	}

}
