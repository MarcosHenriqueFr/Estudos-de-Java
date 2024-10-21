package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//ler num1 e num2
		//pedir operação
		//execução a partir da operação
		//Usar o que foi ensinado
		
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2;
		int operador;
		
		System.out.println("Informe o primeiro número: ");
		num1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Informe o segundo número: ");
		num2 = Double.parseDouble(entrada.nextLine());
		
		System.out.printf("Informe uma operação: \n\n1) +\n2) -\n3) *\n4) /");
		operador = entrada.nextInt();
		
		double divisao = num1 / num2;
		double multiplicacao = operador == 3 ? num1 * num2 : divisao;
		double subtracao = operador == 2 ? num1 - num2 : multiplicacao;
		double soma = operador == 1 ? num1 + num2 : subtracao;
		double resultado = soma;
		
		System.out.printf("O resultado da operação é %.2f", resultado);
		
		entrada.close();

	}

}
