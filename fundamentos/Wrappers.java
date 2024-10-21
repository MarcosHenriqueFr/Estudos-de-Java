package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer idade = null;
		
		System.out.println("Insira sua idade: ");
		idade = Integer.parseInt(entrada.nextLine());
		
		if(idade < 0 || idade > 100 || idade == 0) {
			System.out.println("Um erro aconteceu");
		} else {			
			System.out.printf("Você tem %d anos\n", idade);
		}
		
		
		entrada.close();
	}
}
