package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro");
		Aluno aluno2 = new Aluno("Vitória");
		Aluno aluno3 = new Aluno("Madalena");
		
		Curso curso1 = new Curso("Programação");
		Curso curso2 = new Curso("Culinária");
		Curso curso3 = new Curso("Desenvolvimento Web");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Matriculado no curso 1: "+aluno.nome);
		}
		
		for (Curso curso: aluno1.cursos) {
			System.out.println("Cursos do "+aluno1.nome+ ": " +curso.nome);
		}
		
		//Se eu entrar no objeto aluno1, entrar na lista de cursos, pegar o segundo(indice 1) e mostrar os alunos
		//que participam dele, é isso que vai mostrar
		System.out.println(aluno1.cursos.get(1).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Programação");
		 
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
			System.out.println(cursoEncontrado.nome);
		}
	}

}
