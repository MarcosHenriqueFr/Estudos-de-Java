package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {//verificação
			System.out.println("Nota inválida");
		} else if(nota >= 8.1) {
			System.out.println("Conceito A");
			System.out.println("Parabéns!!");
		} else if(nota >= 6.1) {
			System.out.println("Conceito B");
		} else if(nota >= 4.1) {
			System.out.println("Conceito C\nPrecisa entregar trabalho!");
		} else if(nota >= 3.1) {
			System.out.println("Conceito D\nMais atenção!");
		} else {
			System.out.println("Conceito E\nReprovado!");
		}
		
		System.out.println("Fim!");
		
		entrada.close();

	}

}
