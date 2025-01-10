package classe;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();		
		
		u1.nome = "José Pereira";
		u1.email = "joseph@ereira.com";
		u2.nome = "José Pereira";
		u2.email = "joseph@ereira.com";	
		
		System.out.println(u1 == u2);//diferentes endereços de memória
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
