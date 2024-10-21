package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner(System.in);
		
		double base, altura;
		
		System.out.println("Informe a base do triângulo");
		base = entrada.nextDouble();
		
		System.out.println("Informe a altura do triângulo");
		altura = entrada.nextDouble();
		
		final double area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é %.2f m2", area);
		
		entrada.close();

	}

}
