package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno príncipe");
		livros.push("Game of Thrones");
		livros.push("O caminho do artista");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.size());
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		System.out.println(livros.isEmpty());
		
	}

}
