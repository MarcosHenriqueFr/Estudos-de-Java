package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//Funciona só que tem castings
//		String ultimaLang = (String) ListaUtil.getUltimo1(langs);
//		Integer ultimoNum = (Integer) ListaUtil.getUltimo1(nums);
//		Double ultimoNum = (Double) listaUtil.getUltimo1(nums);
		
		String ultimaLang = ListaUtil.getUltimo2(langs);
		//Posso especificar
		Integer ultimoNum = ListaUtil.<Integer>getUltimo2(nums);
		
		System.out.println(ultimaLang);
		System.out.println(ultimoNum);
	}

}
