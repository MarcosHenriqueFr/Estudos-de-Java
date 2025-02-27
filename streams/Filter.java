package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedro", 6.7);
		Aluno a2 = new Aluno("Bia", 3.2);
		Aluno a3 = new Aluno("João", 9.9);
		Aluno a4 = new Aluno("Gonçalo", 5.3);
		Aluno a5 = new Aluno("Salomão", 8.7);
		Aluno a6 = new Aluno("Jean", 7.6);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> isAprovado = a -> a.getNota() >= 7; //No filter sai o valor como uma Stream
		Function<Aluno, String> mensagem = a -> "Parabéns "+a.getNome() + ", você foi aprovado!!";
		
		alunos.stream()
			.filter(isAprovado)
			.map(mensagem) //Essa stream tem valor string em cada dado
			.forEach(System.out::println);
	}
}
