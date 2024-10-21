package controle.exer;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ano;
		boolean centenario = false;
		String parte;
		
		System.out.println("Informe um ano: ");
		ano = entrada.nextInt();
		
		if(Integer.toString(ano).length() > 2) {
			parte = Integer.toString(ano).substring(2);			
		} else {
			parte = Integer.toString(ano);
		}
		
		centenario = parte.equals("00") ? true : false;
		
		if(centenario) {
			if(ano % 400 == 0) {
				System.out.println("É um ano bissexto!");
			} else {
				System.out.println("Não é um ano bissexto!");
			}
		} else if(!centenario) {
			if(Integer.parseInt(parte) % 4 == 0) {
				System.out.println("É um ano bissexto!");
			} else {
				System.out.println("Não é um ano bissexto!");
			}
		}
		
		entrada.close();
	}

}
