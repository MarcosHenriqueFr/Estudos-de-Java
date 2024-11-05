package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Jorge");//Cria
		usuarios.put(1, "Clara");//Substitui
		usuarios.put(2, "Rebeca");
		usuarios.put(30, "Valmir");
		usuarios.put(4, "Sofia");
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(12));
		System.out.println(usuarios.get(1));//Retorna chaves e não indices
		
		for(int chave: usuarios.keySet()) {
			System.out.print(chave + " ");
		}
		
		System.out.println();
		
		for(String valores: usuarios.values()) {
			System.out.print(valores + " ");
		}
		
		System.out.println();
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+": ");
			System.out.println(registro.getValue());
		}
	}

}
