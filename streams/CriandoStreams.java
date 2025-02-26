package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;//Posso passar para funções forEach
		Consumer<Integer> println = System.out::println;//Posso passar para funções forEach
		
		//Stream.of -> Método estático, assim como Arrays.asList()
		Stream<String> langs = Stream.of("Java ", "Lua ", "Python ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLangs).forEach(print); //A stream foi criada nessa linha e n deu return em nada
		
		//a partir de Arrays passo o array, crio um subConjunto
		Arrays.stream(maisLangs).forEach(print);
		//(Array, index inicial, index final)Posso cortar o subconjunto, o seg parametro não é mostrado
		Arrays.stream(maisLangs, 0, 2).forEach(print);
		System.out.println();
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		//O processamento não é na ordem
		outrasLangs.parallelStream().forEach(print);
		
		//Gerando de forma indefinida
//		Stream.generate(() -> "a").forEach(print);
		
		//Gerando uma stream, tem uma seed inicial/valor entrada e um UnaryFunction
		//tem como colocar um .limit
		Stream.iterate(0, n -> n + 1).limit(10).forEach(println);
	}
}
