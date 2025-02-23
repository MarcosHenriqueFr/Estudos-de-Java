package testes;

public class JavaTeste {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Sistema.saida.imprimir("Olá");
	}

}

class Sistema {

	static Saida saida = new Saida();
}

class Saida {
	
    public String imprimir(String entrada){
//    	System.out.println(entrada);
    	return entrada;//Não mostra no console, só uma representação
    }
}
