package fundamentos.exercicios;

import java.util.Scanner;

public class ImprimirIMC {

	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura;
		
		System.out.println("Qual seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.println("Qual sua altura: ");
		altura = entrada.nextDouble();
		
		final double IMC = peso / Math.pow(altura, 2);
		
		System.out.println("Seu imc é "+IMC);
		System.out.println(peso + 10);
		
		entrada.close();

	}

}
