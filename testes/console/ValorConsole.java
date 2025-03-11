package testes.console;

import java.util.Scanner;

public class ValorConsole {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String... args) {
		
		try {
			String valor = args[0];
			executar(valor);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entrada.close();
		}
		
		System.out.println("Fim de "+args[0]);
	}

	private static void executar(String valor) {
		if(valor.equals("somar")) {
			soma();
		}
	}

	private static void soma() {
		double n1, n2, soma;
		System.out.println("Digite o primeiro número: ");
		n1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o segundo número: ");
		n2 = Double.parseDouble(entrada.nextLine());
		
		soma = n1 + n2;
		
		System.out.println("O resultado da soma é: "+soma);
	}
}
