package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();

		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		//Sem o hash ele não encontra um valor
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		
		System.out.println(resultado);
	}

}
