package generics;

public class CaixaObjetoTeste {

	//Sem generics(sem generalização)
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);// double -> Double autobox
		
		//Tenho que fazer casting porque sempre retorno um object, só que retorna um double
		//Double coisa = caixaA.abrir();
		//Pode retornar uma exceção e tem que explicitar diretamente
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		//Não verifica 
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);

	}

}
