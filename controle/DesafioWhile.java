package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0, media = 0, valor;
		int notasValidas = 0;
		int sair = 0;
		
		while(sair != -1) {
			System.out.println("Digite uma nota válida para média");
			valor = Double.parseDouble(entrada.next());
			
			if(valor == -1) {
				System.out.println("Adição encerrada!");
				sair = -1;
			} else if(valor > 10 || valor < 0) {
				System.out.println("Nota inválida");
			} else {
				total += valor;
				notasValidas++;
				System.out.println("Valor implementado!");
			}
		}
		
		media = total/notasValidas;
		
		System.out.printf("A média de %d alunos é %.2f!", notasValidas, media);
		
		entrada.close();
	}

}
