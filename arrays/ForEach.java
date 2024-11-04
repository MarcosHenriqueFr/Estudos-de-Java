package arrays;

public class ForEach {

	public static void main(String[] args) {
		//Sem precisar de um contador, quero percorrer o array inteiro passando por todos os elementos
		
		double[] notas = {8.2, 7.4, 8.2, 5.2, 3};
		
		//for(tipo elemento: array){bloco de código}
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		String[] frutas = {"Banana", "Maçã", "Maracujá", "Goiaba"};
		
		//Fácil execução e aplicação
		for(String fruta: frutas) {
			System.out.print(fruta + " ");
		}
	}

}
