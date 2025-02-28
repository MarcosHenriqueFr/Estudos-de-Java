package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Milena", 9.1);
		Aluno a3 = new Aluno("Sofia", 5.1);
		Aluno a4 = new Aluno("Letícia", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isAprovado = a -> a.getNota() >= 7;
		Function<Aluno, Double> notaAluno = a -> a.getNota();
		BinaryOperator<Double> somatorio = (acum, elemento) -> acum + elemento;
		
		alunos.parallelStream()
			  .filter(isAprovado)
			  .map(notaAluno)
			  .reduce(somatorio)
			  .ifPresent(System.out::println);
	}
}
