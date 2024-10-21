package fundamentos;

import java.util.Scanner;

public class TipoString {
	
	public static void main(String[] args) {
		
		//  String s = "Bom dia pessoal";
		//  char ultimoS = s.charAt(s.length() - 1);
		
		//	System.out.println(ultimoS);
		String nome = "Marcos", sobrenome = "Henrique";
		float salario = 21_231.21F;
		
		//igual o C
		//System.out.printf("Nome: %s\nSobrenome: %s\nE ganha R$%.2f", nome, sobrenome, salario);
		String frase = String.format("Nome: %s\nSobrenome: %s\nE ganha R$%.2f", nome, sobrenome, salario);
		System.out.println(frase.indexOf("banana"));
		
		System.out.println(frase);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome1 = entrada.next();
		
		System.out.printf("Olá %s", nome1);
		
		entrada.close();
	}
}
