package controle.exer;

import java.util.Scanner;

public class Paridade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = entrada.nextInt();
		
		if(valor >= 0 && valor <= 10) {
			System.out.println("O valor está entre 0 e 10");
		} else {
			System.out.println("O valor não está entre 0 e 10");
		}
		
		if(valor % 2 == 0) {
			System.out.println("O valor é par!");
		} else {
			System.out.println("O valor não é par!");
		}
		
		entrada.close();
		
	}

}
