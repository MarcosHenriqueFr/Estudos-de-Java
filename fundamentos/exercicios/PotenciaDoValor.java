package fundamentos.exercicios;

import java.util.Scanner;

public class PotenciaDoValor {
	//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Digite um valor: ");
//		String valor = entrada.next().replace(",", ".").trim();
		double valor, valorQuadrado, valorCubo;
		
		while(!entrada.hasNextDouble()) {
			System.out.println("Por favor insira um valor válido!");
			entrada.next();
		}
		valor = entrada.nextDouble();
		valorQuadrado = Math.pow(valor, 2);
		valorCubo = Math.pow(valor, 3);
		
		String formatado = String.format("O valor original é %.2f,\nO valor ao quadrado é %.2f,\n"
				+ "Já o valor ao cubo é %.2f!", valor, valorQuadrado, valorCubo);
		
		System.out.println(formatado);
		
		entrada.close();
	}
}
