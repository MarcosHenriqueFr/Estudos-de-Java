package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		//Escrevo a "classe" soma diretamente
		//Crio a interface genérica "Calculo" e implemento o código dentro da execução
		//Basicamente uma Arrow function/Lambda Function
		Calculo soma = (x , y) -> x * y;
		
		//Obrigatorio desse método: dois parametros e um return double
		//Com chaves precisa de return, pois é um bloco
		Calculo multi = (x, y) -> {return x * y;};
		
		System.out.println(soma.executar(2, 3));
		System.out.println(multi.executar(3, 5));
	}
}
