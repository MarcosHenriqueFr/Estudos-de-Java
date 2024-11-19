package oo.composicao;

import java.util.*;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();
	//Não pode mudar o endereço de memória, mas seus elementos não são constantes
	//É assim que o final funciona em objetos
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	//Sempre que eu quiser converter um objeto para um formato string
	//Impacto nas duas classes/objetos
	public String toString() {
		return nome;
	}
}
