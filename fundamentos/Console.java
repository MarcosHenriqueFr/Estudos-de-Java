package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Coloque sua idade: ");
		idade = entrada.nextInt();
		
		System.out.printf("Você tem %d anos", idade);
		
		entrada.close();
	}

}
