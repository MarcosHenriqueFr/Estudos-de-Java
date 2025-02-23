package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	//a partir do java.util.function
	//<> -> Tipo de parametro/generic(classes)
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x, y) -> x + y;
		
		//Java não permite conversão primitivo diferente pra classe
		//NÃO PERMITE int -> Double
		//PERMITE double -> Double
		System.out.println(calc.apply(2., 3.));
		
	}
}
