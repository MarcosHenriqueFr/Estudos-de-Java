package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(2100);
		
		int coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
