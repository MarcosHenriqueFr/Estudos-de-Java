package controle.exer;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número: ");
		num = entrada.nextInt();
		
		int ehPrimo = primo(num) ? 1 : 0;
		
		switch(ehPrimo) {
			case 1:
				System.out.println("É um número primo");
				break;
			case 0:
				System.out.println("Não é um número primo");
		}
		
		entrada.close();

	}
	
	private static boolean primo(int num) {//resolver por meio de um método
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) 
				return false;
		}
		
		return true;
	}

}
