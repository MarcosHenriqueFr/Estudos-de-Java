package excecao;

import java.util.Scanner;

//Forçar uma execução
public class Finally {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt()); //Pula direto pro erro
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { //Sempre será chamado, forçar que algo seja executado, independentemente
			System.out.println("Finalmente...");
		}
		
		try {
			System.out.println(7 / entrada.nextInt()); //Pula direto pro erro
		} finally { //Sempre será chamado, forçar que algo seja executado, independentemente
			System.out.println("Finalmente #02...");
			entrada.close();
		}
		
		System.out.println("Fim");
	}
}
