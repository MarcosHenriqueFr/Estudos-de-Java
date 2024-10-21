package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia A";
		
		s = s.replace("A", "senhora").toUpperCase().concat("!!!");
		//Encadeamento de método funciona, porque todos retornam strings
		
		System.out.println(s);
	}
}
