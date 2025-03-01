package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {//Todo throwable pode usar um throw
			System.out.println("Olha o erro: "+e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	//Erros precisam ser lançados - throw
	//Não checada, eu escolho tratar ou não, uma Runtime Exception
	public static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro >:>");
	}
	
	//Quando é uma exception ela tem que ser checada, declarada na assinatura do método
	public static void geraErro2() throws Exception{
			throw new Exception("Ocorreu um erro bem legal :)");
	}
}
