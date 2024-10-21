package controle;

public class Continue {

	public static void main(String[] args) {
		//Interrompe uma repetição e continua, não usar eles com muita frequência confundem o fluxo
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;//só essa iteração
			} else if(i == 4) {
				continue;
			}
			System.out.println(i);
		}

	}

}
