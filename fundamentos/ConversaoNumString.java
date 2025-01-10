package fundamentos;

public class ConversaoNumString {

	public static void main(String[] args) {
		//Usando wrappers(forma correta)
		
		Double num1 = 10000.0;
		String numString = num1.toString();
		System.out.println(numString);//diretamente
		
		int num2 = 21;//indireto
		System.out.println(Integer.toString(num2).length());//consigo usar características de strings
		var numString2 = Integer.toString(num2);
		
		if(numString.equalsIgnoreCase(numString2)) {
			System.out.println("Os valores do numero 1 e 2 são iguais");
		} else {
			System.out.println("Os valores são diferentes");
		}
		
		//POG - Programação orientada a Gambiarra
		int num3 = 432;
		System.out.println((num3 + "").length());
		

	}

}
