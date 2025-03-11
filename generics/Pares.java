package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

//Restrição de chave valor
public class Pares<K extends Number, V> {

	//No momento que eu instanciar
	//Uso de diferentes collections, LinkedHashSet -> garante uma ordem a partir de inclusão
	private final Set<Par<K, V>> itens = new LinkedHashSet<Par<K,V>>();
	
	public void adicionar(K chave, V valor) {
		//return em um void, sai do metodo
		if(chave == null) return;
		Par<K, V> novoPar = new Par<K, V>(chave, valor);
		
		//Quero que atualize, já que é chave valor
		//contains usa equals, verifica a chave, add novo valor
		boolean isContido = itens.contains(novoPar);
		if(isContido) {
			itens.remove(novoPar);
		}
		
		itens.add(new Par<K, V>(chave, valor));
	}
	
	public V getValor(K chave) {
		if(chave == null) return null;
		
		Optional<Par<K, V>> parOpcional =  itens.stream()
							.filter(par -> chave.equals(par.getChave()))
							.findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;			
	}
}
