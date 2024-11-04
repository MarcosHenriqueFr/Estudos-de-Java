package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 9.12;
		notasAlunoA[1] = 7.54;
		notasAlunoA[2] = 6.3;
		
		String notas = Arrays.toString(notasAlunoA);
		System.out.println(notas);
		
		double total = 0;
		double tamanho1 = notasAlunoA.length;
		for(int i = 0; i < tamanho1; i++) {
			System.out.println(notasAlunoA[i]);
			total += notasAlunoA[i];
		}
		
		System.out.println(total/tamanho1);
		
		//Menos comum possuir os dados fixos
		double notaArmazenada = 6.1;
		double[] notasAlunoB = {4.6, notaArmazenada, 9.7, 10};//Continua sendo homogêneo e estático
		double tamanho2 = notasAlunoB.length;//length é um atributo em uma array
		
		
		for (int i = 0; i < tamanho2; i++) {
			System.out.println(notasAlunoB[i]);
		}
	}
}
