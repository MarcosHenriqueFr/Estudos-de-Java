package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Milena", 8.1);
		Aluno a3 = new Aluno("Sofia", 7.1);
		Aluno a4 = new Aluno("Letícia", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isAprovado = a -> a.getNota() >= 7;
		Predicate<Aluno> isReprovado = isAprovado.negate();
		
		//Se fizer isso a stream sera consumida na primeira operação em outro valor, já que match é uma operação terminal
//		Stream<Aluno> base = alunos.stream();
		
		//allMatch - Todos seguem a condição?
		//anyMatch - Qualquer um 
		//noneMatch - nenhum
		System.out.println(alunos.stream().allMatch(isAprovado));
		System.out.println(alunos.stream().anyMatch(isAprovado));
		System.out.println(alunos.stream().noneMatch(isReprovado));
			
	}

}
