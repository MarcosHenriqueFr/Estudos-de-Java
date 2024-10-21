package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		//pega 3 salários de um funcionario e apresenta a media, além de poder escrever com . ou ,
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu último salário: ");
		String valor1 = entrada.nextLine().replace(",", ".").trim();
		
		System.out.println("Digite o seu penúltimo salário: ");
		String valor2 = entrada.nextLine().replace(",", ".").trim();
		
		System.out.println("Digite o seu antepenúltimo salário: ");
		String valor3 = entrada.nextLine().replace(",", ".").trim();
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("salario 1: "+salario1);
		System.out.println("salario 2: "+salario2);
		System.out.println("salario 3: "+salario3);
		System.out.println("A média dos 3 salários é "+media);
		
		entrada.close();

	}

}
