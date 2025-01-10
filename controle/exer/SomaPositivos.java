package controle.exer;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		//FAZER:  Criar um programa que enquanto estiver recebendo números positivos,
		//imprime no console a soma dos números inseridos, caso receba um número negativo,
		//encerre o programa. Tente utilizar a estrutura do while.
		Scanner entrada = new Scanner(System.in);
		
		double numAtual = 0, total = 0;
		boolean positivo = true;
		
		while(positivo) {
			System.out.print("Insira um valor positivo: ");
			numAtual = entrada.nextDouble();
			
			if(numAtual >= 0) {				
				total += numAtual;
				System.out.printf("Essa é a soma dos valores: %.2f\n", total);
			} else {
				positivo = false;
			}
		}
		
		System.out.println("Inseriu valor negativo!");
		System.out.println("FIM DO PROGRAMA");
		
		entrada.close();
	}
}
