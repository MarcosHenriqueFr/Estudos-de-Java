package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Milena", 8.1);
		Aluno a3 = new Aluno("Sofia", 6.1);
		Aluno a4 = new Aluno("Letícia", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isAprovado = a -> a.getNota() >= 7;
		Function<Aluno, Double> notaAluno = a -> a.getNota();
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
			.filter(isAprovado)
			.map(notaAluno)
			//Terceira forma de usar reduce, entra um objeto e sai o mesmo tipo dele, só o combinar media reduz
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A média da turma é " + media.getValor());
	}
}
