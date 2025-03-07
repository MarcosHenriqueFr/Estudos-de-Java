package todoList.programa.tl.estudos;

import java.util.Scanner;

//Teste deu errado
public class TesteTry {

	public static void main(String[] args) {
		mostrarConsole();
	}
	
	//Esse está no gerenciadorConsole
	static void mostrarConsole() {
		Scanner entrada = new Scanner(System.in);
		
		Integer valor = adicionarInteiro(entrada);
		System.out.println(valor);
		
		entrada.close();
	}
	
	
	//Esse está no gerenciador
	static Integer adicionarInteiro(Scanner entrada) {
		
		Integer num = null;
		
		do {			
			System.out.println("Informe um número:");
			
			try {
				num = Integer.parseInt(entrada.nextLine());
			} catch(RuntimeException e) {
				System.out.println("Gerou o erro: " + e.getMessage());
			} 
		} while(num == null);
		
		return num;
		
	}

}
