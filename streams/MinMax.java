package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Milena", 8.1);
		Aluno a3 = new Aluno("Sofia", 6.1);
		Aluno a4 = new Aluno("Letícia", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.getNota() > aluno2.getNota()) return 1;
			if(aluno1.getNota() < aluno2.getNota()) return -1;
			return 0;
		};
		
		//Retornos do comparator
		//1 - 1º V 2°
		//-1 - 1° F 2°
		//0 - ambos iguais
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.getNota() < aluno2.getNota()) return 1;
			if(aluno1.getNota() > aluno2.getNota()) return -1;
			return 0;
		};
		
		//Max e min recebem um comparator que comparam dois valores
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		//Para deixar o código mais legivel
		System.out.println(alunos.stream().max(piorNota).get());
	}
}
