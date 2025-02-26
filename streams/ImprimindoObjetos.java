package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Bia", "Lia", "Gui", "Mia");
		
//		aprovados.forEach(System.out::println);
		
		System.out.println("Usando forEach");
		for(String aprovado: aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\nUsando Iterator - interface java");
		Iterator<String> it = aprovados.iterator();
		//Tem proximo?
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		
		stream.forEach(System.out::println);
		
	}
}
