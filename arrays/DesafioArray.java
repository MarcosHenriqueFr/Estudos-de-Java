package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		//Pedir para o usuário informar as notas do aluno(1) e depois fazer a media(2) e mostrar
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas;
		double soma = 0;
		double media = 0;
		
		System.out.println("Informe a quantidade de notas: ");
		quantidadeNotas = entrada.nextInt();
		entrada.nextLine();
		
		double notas[] = new double[quantidadeNotas];
		
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.printf("Informe a %d nota: ", i+1);
			
			while(!entrada.hasNextDouble()) {
				System.out.println("Informe uma nota válida");
				entrada.next();
			}
			
			notas[i] = entrada.nextDouble();
		}
		
		for(double nota: notas) {//Somente com fim educativo, é melhor fazer em um só
			soma += nota;
		}
		
		media = soma/notas.length;
		
		System.out.println("A média das notas resultou em: "+String.format("%.2f", media));
		
		entrada.close();
	}

}
