package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	//Criar duas expressões lambdas filter e um map
	public static void main(String[] args) {
		//Aluno Universitario
		//Filter - isMaiorDeIdade
		//Filter - isSalarioMaiorQue2000
		//Map - Transformar em string
		AlunoUni a1 = new AlunoUni("Pedro", 17, 1268.90);
		AlunoUni a2 = new AlunoUni("Maria", 21, 4300.20);
		AlunoUni a3 = new AlunoUni("Jorge", 19, 750.68);
		AlunoUni a4 = new AlunoUni("Milena", 35, 3220.37);
		
		List<AlunoUni> alunosUniversitarios = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<AlunoUni> isMaiorDeIdade = aluno -> aluno.getIdade() >= 18;
		Predicate<AlunoUni> isSalarioMaiorQue2000 = aluno -> aluno.getSalario() > 2000;
		Function<AlunoUni, String> trabalhandoNaArea = aluno -> aluno.getNome() + " atua na área como um profissional!";
		
		alunosUniversitarios.stream()
				.filter(isMaiorDeIdade)
				.filter(isSalarioMaiorQue2000)
				.map(trabalhandoNaArea)
				.forEach(System.out::println);
	}
}
