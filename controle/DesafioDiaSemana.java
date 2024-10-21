package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//domingo -> 1, fazer uma estrutura que retorne um número de acordo com o nome
		
		Scanner entrada = new Scanner(System.in);
		String dia;
		
		System.out.println("Informe um dia da semana: ");
		dia = entrada.next();//pega só uma palavra
		dia = dia.toLowerCase();
		
		boolean domingo = dia.equalsIgnoreCase("domingo");//dá para usar o ignore Case também, melhor de usar
		boolean segunda = dia.equals("segunda");
		boolean terca = dia.equals("terça") || dia.equals("terca");
		boolean quarta = dia.equals("quarta");
		boolean quinta = dia.equals("quinta");
		boolean sexta = dia.equals("sexta");
		boolean sabado = dia.equals("sábado") || dia.equals("sabado");
		
		if(domingo) {
			System.out.println("Esse é o 1 dia da semana!");
		} else if(segunda) {
			System.out.println("Esse é o 2 dia da semana!");
		} else if(terca) {
			System.out.println("Esse é o 3 dia da semana!");
		}  else if(quarta) {
			System.out.println("Esse é o 4 dia da semana!");
		} else if(quinta) {
			System.out.println("Esse é o 5 dia da semana!");
		}	else if(sexta) {
			System.out.println("Esse é o 6 dia da semana!");
		} else if(sabado) {
			System.out.println("Esse é o 7 dia da semana!");
		} else {
			System.out.println("Digitou errado ou não é um dia da semana!");
		}
		
		System.out.println("Fim!");
		entrada.close();

	}

}
