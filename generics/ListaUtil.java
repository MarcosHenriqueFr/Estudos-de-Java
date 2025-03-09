package generics;

import java.util.List;

public class ListaUtil {

	//Pode ser de qualquer coisas <?> 
	//ou <? extends Number> -> tudo que vem de Number 
	public static Object getUltimo1(List<?> lista) {
		return lista.getLast();
	}
	
	//Retorna o Tipo específico
	public static <T> T getUltimo2(List<T> lista) {
		return lista.getLast();
	}
	
	//mais de um parametro generico
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
