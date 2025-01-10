package controle.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorValor {
	//Crie um programa que recebe 10 valores e ao final imprima o maior número.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		System.out.println("Insira 10 valores aleatórios: ");
		
		//Guardar os valores na collection
		for(int i = 0; i < 10; i++) {
			while(!entrada.hasNextDouble()) {
				System.out.println("Informe um valor REAL!");
				entrada.next();
			}
			lista.add(entrada.nextDouble());
		}
		int tamanho = lista.size();//inserir tamanho depois de adicionar os números
		Collections.sort(lista);//Organiza uma collection facilmente se for só valores primitivos
		System.out.println(lista.toString());
		
		System.out.println("O maior valor da lista é "+lista.get(tamanho-1));
		
		entrada.close();
	}
}
