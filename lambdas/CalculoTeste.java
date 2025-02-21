package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		//Instanciando a partir de uma interface, possível a partir do polimorfismo e referência de interface
		//A interface calculo funciona como um contrato, desde que seja implementada
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(4, 5));
		
		//Objeto somar se foi
		calculo = new Multiplicar();
		System.out.println(calculo.executar(4, 5));
	}
}
