package testes;

import java.util.Arrays;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		String[][] arrayFonte = new String[5][5];
		
		int valorI = arrayFonte.length;
		int valorJ = arrayFonte[0].length;
		
		String[][] arrayCopia1 = new String[valorI][valorJ];
		
		
		//add no fonte
		for(int i = 0; i < valorI; i++) {
			for(int j = 0; j < valorJ; j++) {
				arrayFonte[i][j] = String.format("[%d, %d]", i, j);
			}
		}
		
		//Formas de copiar uma array multidimensional, funciona com as unidimensionais tb
		for(int i = 0; i < valorI; i++) {
			for(int j = 0; j < valorJ; j++) {
				arrayCopia1[i][j] = arrayFonte[i][j];
			}
		}
		
		//Copia bem mais facil e ainda armazena os valores de cada um
		//String[String["i, j"]] -> Representação visual
		String[][] arrayCopia2 = Arrays.copyOf(arrayFonte, valorI);
		for(String[] arrayBase: arrayCopia2) {
			for(String str: arrayBase) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		
		System.out.print("\n\n\n");
		
		//desempacotar a array e mostra a copia
		for(String[] array1: arrayCopia1) {
			for(String elemento: array1) {				
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
