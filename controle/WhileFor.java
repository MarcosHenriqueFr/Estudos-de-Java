package controle;

public class WhileFor {

	public static void main(String[] args) {
		//While - quantidade indeterminada de repetições
		//for - quantidade específica de repetições, predefinida
		
//		int contador = 0;
//		while(contador <= 20) {
//			System.out.printf("Num: %d\n", contador);
//			contador += 2;
//		}
		
		for(int cont = 0; cont <= 20; cont += 2) {//não precisa das partes definidas
			System.out.printf("Número: %d\n", cont);
		}
		
//		for(;true;) {
			//Laço infinito!!
//		}
	}

}
