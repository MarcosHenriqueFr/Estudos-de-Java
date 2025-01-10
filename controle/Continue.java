package controle;

public class Continue {

	public static void main(String[] args) {
		//Interrompe uma repetição e continua, não usar eles com muita frequência confundem o fluxo
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			} else if(i == 7) {
				continue;
			}
			System.out.println(i);
		}

	}

}
