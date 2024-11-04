package arrays;

import java.util.Arrays;

public class ExercicioForEach {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 9.12;
		notasAlunoA[1] = 7.54;
		notasAlunoA[2] = 6.3;
		
		String notas = Arrays.toString(notasAlunoA);
		System.out.println(notas);
		
		double total = 0;
		for(double nota: notasAlunoA) {
			System.out.print(nota + " ");
			total += nota;
		}
		
		System.out.println();
		System.out.println(total/notasAlunoA.length);
		
		double notaArmazenada = 6.1;
		double[] notasAlunoB = {4.6, notaArmazenada, 9.7, 10};
		
		for(double nota: notasAlunoB) {
			System.out.print(nota + " ");
		}
	}

}
