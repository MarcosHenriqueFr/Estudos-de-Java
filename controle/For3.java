package controle;
//o debug possui a função de watch para verificar expressões
public class For3 {

	public static void main(String[] args) {
		//o for forma um escopo, restrito ao laço
		int quant = 10;
		for(int i = 1; i <= quant; i++) {
			//no escopo
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			if(i != quant) {
				System.out.print("\n");
			}
		}
		
		//fora, o algoritmo é executado de forma sequencial
		
	}

}
