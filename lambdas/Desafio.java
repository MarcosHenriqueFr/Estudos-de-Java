package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> calcularPrecoComDesconto = 
				produto -> produto.preco * (1 - produto.desconto);
				
		UnaryOperator<Double> calcularImposto = valor -> { 
			double imposto = 0.085;
			return valor >= 2500 ? valor * (1 + imposto) : valor;
		};
		
		UnaryOperator<Double> adicionarFrete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		
		UnaryOperator<Double> arredondar = valor -> (double) Math.round(valor * 100) / 100;
		
		Function<Double, String> formatar = valorString -> "R$" + valorString.toString().replace(".", ",");
		
		String precoFinal = calcularPrecoComDesconto
							.andThen(calcularImposto)
							.andThen(adicionarFrete)
							.andThen(arredondar)
							.andThen(formatar)
							.apply(p);
		
		System.out.println(precoFinal);
	}
}
