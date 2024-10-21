package fundamentos;

public class ConversaoNumString {

	public static void main(String[] args) {
		//Usando wrappers(forma correta)
		
		Double num1 = 10000.0;
		System.out.println(num1.toString());//diretamente
		
		int num2 = 21;//indireto
		System.out.println(Integer.toString(num2).length());//consigo usar características de strings
		
		//POG - Programação orientada a Gambiarra
		int num3 = 432;
		System.out.println((num3 + "").length());
		

	}

}
