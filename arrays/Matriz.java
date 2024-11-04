package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Arrays multidimensionais são apenas arrays dentro das outras
//{el1 -> {3.2, 3.2, 7.8}, el2, el3}
//Alunos - Array externo, Notas -> Array interno
public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtAlunos, qtNotas;
		
		System.out.println("Quantas alunos na turma? ");//alunos são i
		qtAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas para cada aluno? ");
		qtNotas = entrada.nextInt();

		double[][] notasTurma = new double[qtAlunos][qtNotas];
		
		//Captura
		for(int i = 0; i < qtAlunos; i++) {
			System.out.printf("Informe as notas do aluno %d\n", i+1);
			for(int j = 0; j < qtNotas; j++) {
				System.out.printf("Informe a nota %d: ", j+1);
				
				while(!entrada.hasNextDouble()) {
					System.out.println("Informe um valor válido!");
					entrada.next();
				}
				
				notasTurma[i][j] = entrada.nextDouble();
			}
			System.out.println();
		}
		
		//Imprime
		for(int i = 0; i < qtAlunos; i++) {
			System.out.printf("Nota do aluno %d: ", i+1);
			for(int j = 0; j < qtNotas; j++) {
				System.out.printf("%.2f ", notasTurma[i][j]);
			}
			System.out.println();
		}
		
		//Também possível com forEach
//		for(double[] notaAluno: notasTurma) {
//			System.out.println(Arrays.toString(notaAluno));
//		}
		
		//MÉDIA TURMA
		
		double[] mediaAlunos = new double[qtAlunos];
		
		//Média de cada aluno
		for(int i = 0; i < qtAlunos; i++) {
			double soma = 0;
			double media;
			for(int j = 0; j < qtNotas; j++) {
				soma += notasTurma[i][j];
			}
			media = soma/qtNotas;
			
			mediaAlunos[i] = media;
		}
		
		System.out.println(Arrays.toString(mediaAlunos));
		
		//Média geral das notas
		double mediaTurma = 0;
		double somaTurma = 0;
		for(int i = 0; i < qtAlunos; i++) {
			somaTurma += mediaAlunos[i];
		}
		mediaTurma = somaTurma/qtAlunos;
		
		System.out.printf("A média geral da nota final turma é %.2f\n", mediaTurma);

		entrada.close();
	}

}
