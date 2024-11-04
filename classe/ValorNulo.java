package classe;

public class ValorNulo {

	public static void main(String[] args) {
		String s1 = "";//Tem alocação
		String s2 = Math.random() > 0.5 ? "Bom dia" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat(" aoba"));
		} 
		
		System.out.println(s1.concat("!!!!"));
		//System.out.println(s2.concat("!!!!"));//ERRO EM RUNTIME
	}

}
