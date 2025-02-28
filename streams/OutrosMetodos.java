package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Milena", 8.1);
		Aluno a3 = new Aluno("Sofia", 7.1);
		Aluno a4 = new Aluno("Letícia", 10);
		Aluno a5 = new Aluno("Mariana", 5.3);
		Aluno a6 = new Aluno("Ester", 10);
		Aluno a7 = new Aluno("Sofia", 7.1);
		Aluno a8 = new Aluno("Caio", 7.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		//Esses três métodos são intermediários
		
		//Executa um equals e verifica se é igual
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		//Paginação, consigo pular minha stream e limitar quantos eu pego
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(3)
			.limit(1)
			.forEach(System.out::println);
		
		//Executa até que a condição seja falso, é como um filter que para no que der false
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile(aluno -> aluno.getNota() >= 7)
			.forEach(System.out::println);
	}

}
