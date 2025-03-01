package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OutrosMetodos {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 2.1);
		Aluno a2 = new Aluno("Milena", 8.1);
		Aluno a3 = new Aluno("Sofia", 7.1);
		Aluno a4 = new Aluno("Letícia", 10);
		Aluno a5 = new Aluno("Mariana", 5.3);
		Aluno a6 = new Aluno("Ester", 10);
		Aluno a7 = new Aluno("Sofia", 7.1);
		Aluno a8 = new Aluno("Caio", 3.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Criando uma nova lista");
		//Peek é muito usado para debugging, posso remover depois
		List<String> alunosAprovados =  alunos.stream()
			.distinct()
			.filter(x -> x.getNota() >= 6)
//			.peek(a-> System.out.println("Aluno filtrado: " + a.getNome()))
			.map(a -> "O aluno " + a.getNome() + " está aprovado")
//			.peek(valor -> System.out.println("Valor de saida: " + valor))
			.collect(Collectors.toList());
		
		alunosAprovados.forEach(System.out::println);

		//Esses três métodos são intermediários
		
		//Executa um equals e verifica se é igual
		System.out.println("\ndistinct...");
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
