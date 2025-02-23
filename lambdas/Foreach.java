package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Gui", "Lia", "Jão");
		
//		for(int i = 0; i < aprovados.size(); i++) {
//			System.out.println(aprovados.get(i));
//		}
		
		System.out.println("Forma tradicional");
		for(String nomeAprovado: aprovados) {
			System.out.println(nomeAprovado);
		}
		
		//Igual javascript, como é uma Lista de Strings, não precisa especificar no forEach, pois está no objeto
		//Consigo personalizar
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		//Para cada aprovado utilize esse método
		System.out.println("\nMethod Reference #01..."); //::
		aprovados.forEach(System.out::println);
		
		//Da minha classe eu chamo a minha função
		System.out.println("\nMethod Reference #02..."); //::
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é "+nome);
	}
}
