package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		//.stream - build, .map - int ops, .forEach - terminal
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		System.out.println("\n"+Utilitarios.maiuscula.andThen(primeiraLetra).andThen(Utilitarios::grito).apply("teste"));
		
		//Não modifico a stream original
		//Uso encadeamento de maps ao invés de encadeamento de unarios
		marcas.stream()
			  .map(Utilitarios.maiuscula)
			  .map(primeiraLetra)
			  .map(Utilitarios::grito)
			  .forEach(print);
	}
}
