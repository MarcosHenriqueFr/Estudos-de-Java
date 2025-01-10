package fundamentos.operadores;

public class Relacionais {

	  public static void main(String[] args) {
		    boolean trabalho1 = false;
		    boolean trabalho2 = false;
		    boolean Sairam = trabalho1 || trabalho2;
		    boolean sorvete = Sairam;
		    boolean saudavel = !sorvete;
		    boolean tv50 = trabalho1 && trabalho2;
		    boolean tv32 = trabalho1 ^ trabalho2;
		    
		    System.out.println("Trabalho 1 foi feito? "+trabalho1);
		    System.out.println("Trabalho 2 foi feito? "+trabalho2);
		    
		    System.out.println("Foram ao shopping? "+Sairam);
		    System.out.println("Compraram a Tv de 50? "+tv50);
		    System.out.println("Compraram a Tv de 32? "+tv32);
		    
		    System.out.println("Tomaram sorvete? "+sorvete);
		    System.out.println("Mais saudável? "+saudavel);
		  }
}
