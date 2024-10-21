package controle.exer;

import java.util.Scanner;

public class MediaSituacaoAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Informe a nota 1: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A média do aluno é "+media);
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado!");
		} else if(media > 4.0) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		entrada.close();

	}

}
