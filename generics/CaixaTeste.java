package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Hello");
//		caixaA.guardar(2); Nao funciona
		
		//Sem conversão, erros são de compilação
		String coisaA = caixaA.abrir(); 
		System.out.println(coisaA);
		
		Caixa<Integer> caixaB = new Caixa<Integer>();
		caixaB.guardar(2);
		
		int coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
