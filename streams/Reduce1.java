package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//Pode ser um biFunction
		BinaryOperator<Integer> somaValores = (acum, vAtual) -> acum + vAtual;
		
		//Não retorna uma stream, é uma operação terminal
		int total = nums.stream().reduce(somaValores).get(); //Inteiro Opcional, não tem certeza, USAR O GET
		System.out.println(total);
		
		//Paralelo - cada operação/valor recebe um valor incial
		//Serial - a operação é o completo
		Integer total2 = nums.parallelStream().reduce(100, somaValores); //Valor inteiro inicial passado
		Integer total3 = nums.stream().reduce(100, somaValores);
		System.out.println(total2);
		System.out.println(total3);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(somaValores) // Retorna InteiroOpcional
			.ifPresent(System.out::println);
	}
}
